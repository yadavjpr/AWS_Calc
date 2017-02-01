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
 * GetABOpResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetABOpResultJsonUnmarshaller implements Unmarshaller<GetABOpResult, JsonUnmarshallerContext> {

    public GetABOpResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetABOpResult getABOpResult = new GetABOpResult();

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

            getABOpResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getABOpResult;
    }

    private static GetABOpResultJsonUnmarshaller instance;

    public static GetABOpResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetABOpResultJsonUnmarshaller();
        return instance;
    }
}
