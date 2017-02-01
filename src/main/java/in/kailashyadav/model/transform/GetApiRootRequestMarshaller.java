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

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * GetApiRootRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiRootRequestMarshaller implements Marshaller<Request<GetApiRootRequest>, GetApiRootRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetApiRootRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetApiRootRequest> marshall(GetApiRootRequest getApiRootRequest) {

        if (getApiRootRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetApiRootRequest> request = new DefaultRequest<GetApiRootRequest>("Calc");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/Calc/";

        request.setResourcePath(uriResourcePath);

        if (getApiRootRequest.getA() != null) {
            request.addParameter("a", StringUtils.fromString(getApiRootRequest.getA()));
        }

        if (getApiRootRequest.getB() != null) {
            request.addParameter("b", StringUtils.fromString(getApiRootRequest.getB()));
        }

        if (getApiRootRequest.getOp() != null) {
            request.addParameter("op", StringUtils.fromString(getApiRootRequest.getOp()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
