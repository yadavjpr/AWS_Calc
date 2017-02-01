/**
 * null
 */
package in.kailashyadav.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/PostApiRoot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostApiRootResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Result result;

    /**
     * @param result
     */

    public void setResult(Result result) {
        this.result = result;
    }

    /**
     * @return
     */

    public Result getResult() {
        return this.result;
    }

    /**
     * @param result
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostApiRootResult result(Result result) {
        setResult(result);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostApiRootResult == false)
            return false;
        PostApiRootResult other = (PostApiRootResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public PostApiRootResult clone() {
        try {
            return (PostApiRootResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
