/**
 * null
 */
package in.kailashyadav.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import in.kailashyadav.model.*;

import com.amazonaws.protocol.json.*;

/**
 * OutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Output output, StructuredJsonGenerator jsonGenerator) {

        if (output == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (output.getC() != null) {
                jsonGenerator.writeFieldName("c").writeValue(output.getC());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OutputJsonMarshaller instance;

    public static OutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputJsonMarshaller();
        return instance;
    }

}
