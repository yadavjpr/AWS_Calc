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
 * GetApiRootResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiRootResultJsonUnmarshaller implements Unmarshaller<GetApiRootResult, JsonUnmarshallerContext> {

    public GetApiRootResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetApiRootResult getApiRootResult = new GetApiRootResult();

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

            getApiRootResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getApiRootResult;
    }

    private static GetApiRootResultJsonUnmarshaller instance;

    public static GetApiRootResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetApiRootResultJsonUnmarshaller();
        return instance;
    }
}
