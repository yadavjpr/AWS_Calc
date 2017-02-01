/**
 * null
 */
package in.kailashyadav.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import in.kailashyadav.model.*;

import com.amazonaws.protocol.json.*;

/**
 * InputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Input input, StructuredJsonGenerator jsonGenerator) {

        if (input == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
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
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InputJsonMarshaller instance;

    public static InputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonMarshaller();
        return instance;
    }

}
