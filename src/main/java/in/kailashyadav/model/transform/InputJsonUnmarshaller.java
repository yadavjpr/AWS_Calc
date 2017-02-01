/**
 * null
 */
package in.kailashyadav.model.transform;

import java.math.*;

import javax.annotation.Generated;

import in.kailashyadav.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Input JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputJsonUnmarshaller implements Unmarshaller<Input, JsonUnmarshallerContext> {

    public Input unmarshall(JsonUnmarshallerContext context) throws Exception {
        Input input = new Input();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("a", targetDepth)) {
                    context.nextToken();
                    input.setA(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("b", targetDepth)) {
                    context.nextToken();
                    input.setB(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("op", targetDepth)) {
                    context.nextToken();
                    input.setOp(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return input;
    }

    private static InputJsonUnmarshaller instance;

    public static InputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonUnmarshaller();
        return instance;
    }
}
