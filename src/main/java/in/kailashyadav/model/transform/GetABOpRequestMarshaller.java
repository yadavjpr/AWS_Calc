/**
 * null
 */
package in.kailashyadav.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import in.kailashyadav.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * GetABOpRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetABOpRequestMarshaller implements Marshaller<Request<GetABOpRequest>, GetABOpRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetABOpRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetABOpRequest> marshall(GetABOpRequest getABOpRequest) {

        if (getABOpRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetABOpRequest> request = new DefaultRequest<GetABOpRequest>("Calc");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/Calc/{a}/{b}/{op}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "a", getABOpRequest.getA());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "b", getABOpRequest.getB());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "op", getABOpRequest.getOp());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
