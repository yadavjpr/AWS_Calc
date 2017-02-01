/**
 * null
 */
package in.kailashyadav.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/GetABOp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetABOpRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String a;

    private String b;

    private String op;

    /**
     * @param a
     */

    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return
     */

    public String getA() {
        return this.a;
    }

    /**
     * @param a
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetABOpRequest a(String a) {
        setA(a);
        return this;
    }

    /**
     * @param b
     */

    public void setB(String b) {
        this.b = b;
    }

    /**
     * @return
     */

    public String getB() {
        return this.b;
    }

    /**
     * @param b
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetABOpRequest b(String b) {
        setB(b);
        return this;
    }

    /**
     * @param op
     */

    public void setOp(String op) {
        this.op = op;
    }

    /**
     * @return
     */

    public String getOp() {
        return this.op;
    }

    /**
     * @param op
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetABOpRequest op(String op) {
        setOp(op);
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
        if (getA() != null)
            sb.append("A: ").append(getA()).append(",");
        if (getB() != null)
            sb.append("B: ").append(getB()).append(",");
        if (getOp() != null)
            sb.append("Op: ").append(getOp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetABOpRequest == false)
            return false;
        GetABOpRequest other = (GetABOpRequest) obj;
        if (other.getA() == null ^ this.getA() == null)
            return false;
        if (other.getA() != null && other.getA().equals(this.getA()) == false)
            return false;
        if (other.getB() == null ^ this.getB() == null)
            return false;
        if (other.getB() != null && other.getB().equals(this.getB()) == false)
            return false;
        if (other.getOp() == null ^ this.getOp() == null)
            return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getA() == null) ? 0 : getA().hashCode());
        hashCode = prime * hashCode + ((getB() == null) ? 0 : getB().hashCode());
        hashCode = prime * hashCode + ((getOp() == null) ? 0 : getOp().hashCode());
        return hashCode;
    }

    @Override
    public GetABOpRequest clone() {
        return (GetABOpRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetABOpRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
