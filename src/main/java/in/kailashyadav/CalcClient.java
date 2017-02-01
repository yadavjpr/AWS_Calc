/**
 * null
 */
package in.kailashyadav;

import java.util.Arrays;

import javax.annotation.Generated;

import com.amazonaws.SdkBaseException;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.protocol.json.JsonClientMetadata;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.JsonErrorShapeMetadata;
import com.amazonaws.protocol.json.JsonOperationMetadata;

import in.kailashyadav.model.GetABOpRequest;
import in.kailashyadav.model.GetABOpResult;
import in.kailashyadav.model.GetApiRootRequest;
import in.kailashyadav.model.GetApiRootResult;
import in.kailashyadav.model.PostApiRootRequest;
import in.kailashyadav.model.PostApiRootResult;
import in.kailashyadav.model.transform.GetABOpRequestMarshaller;
import in.kailashyadav.model.transform.GetABOpResultJsonUnmarshaller;
import in.kailashyadav.model.transform.GetApiRootRequestMarshaller;
import in.kailashyadav.model.transform.GetApiRootResultJsonUnmarshaller;
import in.kailashyadav.model.transform.PostApiRootRequestMarshaller;
import in.kailashyadav.model.transform.PostApiRootResultJsonUnmarshaller;

/**
 * Client for accessing Calc. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class CalcClient implements Calc {

    private final ClientHandler clientHandler;

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(in.kailashyadav.model.CalcException.class));

    /**
     * Constructs a new client to invoke service methods on Calc using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    CalcClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param getABOpRequest
     * @return Result of the GetABOp operation returned by the service.
     * @sample Calc.GetABOp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/GetABOp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetABOpResult getABOp(GetABOpRequest getABOpRequest) {
        HttpResponseHandler<GetABOpResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetABOpResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetABOpRequest, GetABOpResult>().withMarshaller(new GetABOpRequestMarshaller(protocolFactory))
                .withResponseHandler(responseHandler).withErrorResponseHandler(errorResponseHandler).withInput(getABOpRequest));
    }

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample Calc.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest) {
        HttpResponseHandler<GetApiRootResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetApiRootResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetApiRootRequest, GetApiRootResult>()
                .withMarshaller(new GetApiRootRequestMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getApiRootRequest));
    }

    /**
     * @param postApiRootRequest
     * @return Result of the PostApiRoot operation returned by the service.
     * @sample Calc.PostApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/PostApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostApiRootResult postApiRoot(PostApiRootRequest postApiRootRequest) {
        HttpResponseHandler<PostApiRootResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostApiRootResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostApiRootRequest, PostApiRootResult>()
                .withMarshaller(new PostApiRootRequestMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postApiRootRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
