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
 * Result JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultJsonUnmarshaller implements Unmarshaller<Result, JsonUnmarshallerContext> {

    public Result unmarshall(JsonUnmarshallerContext context) throws Exception {
        Result result = new Result();

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
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    result.setInput(InputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("output", targetDepth)) {
                    context.nextToken();
                    result.setOutput(OutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return result;
    }

    private static ResultJsonUnmarshaller instance;

    public static ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResultJsonUnmarshaller();
        return instance;
    }
}
