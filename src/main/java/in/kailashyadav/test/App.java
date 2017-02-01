package in.kailashyadav.test;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;

import in.kailashyadav.Calc;
import in.kailashyadav.model.GetABOpRequest;
import in.kailashyadav.model.GetABOpResult;
import in.kailashyadav.model.GetApiRootRequest;
import in.kailashyadav.model.GetApiRootResult;
import in.kailashyadav.model.Input;
import in.kailashyadav.model.Output;
import in.kailashyadav.model.PostApiRootRequest;
import in.kailashyadav.model.PostApiRootResult;

public class App 
{
    Calc sdkClient;

    public App() {
        initSdk();
    }

    // The configuration settings are for illustration purposes and may not be a recommended best practice.
    private void initSdk() {
        sdkClient = Calc.builder()
              .connectionConfiguration(
                  new ConnectionConfiguration()
                        .maxConnections(100)
                        .connectionMaxIdleMillis(1000))
              .timeoutConfiguration(
                  new TimeoutConfiguration()
                        .httpRequestTimeout(3000)
                        .totalExecutionTimeout(10000)
                        .socketTimeout(2000))
        .build();

    }
    // Calling shutdown is not necessary unless you want to exert explicit control of this resource.
    public void shutdown() {
        sdkClient.shutdown();
    }
     
    // GetABOpResult getABOp(GetABOpRequest getABOpRequest)
    public Output getResultWithPathParameters(String x, String y, String operator) {
    	operator = operator.equals("+") ? "add" : operator;
    	operator = operator.equals("/") ? "div" : operator; 

        GetABOpResult abopResult = sdkClient.getABOp(new GetABOpRequest().a(x).b(y).op(operator));
        return abopResult.getResult().getOutput();
    }

    public Output getResultWithQueryParameters(String a, String b, String op) {
        GetApiRootResult rootResult = sdkClient.getApiRoot(new GetApiRootRequest().a(a).b(b).op(op));
        return rootResult.getResult().getOutput();
    }

    public Output geResultByPostInputBody(Double x, Double y, String o) {
    	PostApiRootResult postResult = sdkClient.postApiRoot(
    		new PostApiRootRequest().input(new Input().a(x).b(y).op(o)));
    	return postResult.getResult().getOutput();
    }

    public static void main( String[] args )
    {
        System.out.println( "Simple calc" );
        // to begin
        App calc = new App();
        
        // call the SimpleCalc API
        Output res = calc.getResultWithPathParameters("1", "2", "-");
        System.out.printf("GET /1/2/-: %s\n", res.getC());

        // Use the type query parameter
        res = calc.getResultWithQueryParameters("1", "2", "+");
        System.out.printf("GET /?a=1&b=2&op=+: %s\n", res.getC());

        // Call POST with an Input body.
        res = calc.geResultByPostInputBody(1.0, 2.0, "*");
        System.out.printf("PUT /\n\n{\"a\":1, \"b\":2,\"op\":\"*\"}\n %s\n", res.getC());

        
    }
}