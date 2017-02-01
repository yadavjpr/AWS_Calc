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
 * PostApiRootResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostApiRootResultJsonUnmarshaller implements Unmarshaller<PostApiRootResult, JsonUnmarshallerContext> {

    public PostApiRootResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostApiRootResult postApiRootResult = new PostApiRootResult();

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

            postApiRootResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postApiRootResult;
    }

    private static PostApiRootResultJsonUnmarshaller instance;

    public static PostApiRootResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostApiRootResultJsonUnmarshaller();
        return instance;
    }
}
