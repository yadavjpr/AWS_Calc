/**
 * null
 */
package in.kailashyadav;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import in.kailashyadav.model.*;

/**
 * Interface for accessing Calc.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface Calc {

    /**
     * @param getABOpRequest
     * @return Result of the GetABOp operation returned by the service.
     * @sample Calc.GetABOp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/GetABOp" target="_top">AWS
     *      API Documentation</a>
     */
    GetABOpResult getABOp(GetABOpRequest getABOpRequest);

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample Calc.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest);

    /**
     * @param postApiRootRequest
     * @return Result of the PostApiRoot operation returned by the service.
     * @sample Calc.PostApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/PostApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    PostApiRootResult postApiRoot(PostApiRootRequest postApiRootRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static CalcClientBuilder builder() {
        return new CalcClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
