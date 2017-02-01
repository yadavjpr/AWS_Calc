/**
 * null
 */
package in.kailashyadav.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import in.kailashyadav.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Result result, StructuredJsonGenerator jsonGenerator) {

        if (result == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (result.getInput() != null) {
                jsonGenerator.writeFieldName("input");
                InputJsonMarshaller.getInstance().marshall(result.getInput(), jsonGenerator);
            }
            if (result.getOutput() != null) {
                jsonGenerator.writeFieldName("output");
                OutputJsonMarshaller.getInstance().marshall(result.getOutput(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResultJsonMarshaller instance;

    public static ResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResultJsonMarshaller();
        return instance;
    }

}
