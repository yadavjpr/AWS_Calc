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
 * PostApiRootRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostApiRootRequestMarshaller implements Marshaller<Request<PostApiRootRequest>, PostApiRootRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PostApiRootRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PostApiRootRequest> marshall(PostApiRootRequest postApiRootRequest) {

        if (postApiRootRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PostApiRootRequest> request = new DefaultRequest<PostApiRootRequest>("Calc");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/Calc/";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            Input input = postApiRootRequest.getInput();
            if (input != null) {
                jsonGenerator.writeStartObject();
                if (input.getA() != null) {
                    jsonGenerator.writeFieldName("a").writeValue(input.getA());
                }
                if (input.getB() != null) {
                    jsonGenerator.writeFieldName("b").writeValue(input.getB());
                }
                if (input.getOp() != null) {
                    jsonGenerator.writeFieldName("op").writeValue(input.getOp());
                }
                jsonGenerator.writeEndObject();
            }

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
