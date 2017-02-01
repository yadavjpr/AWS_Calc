/**
 * null
 */
package in.kailashyadav.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/Input" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Input implements Serializable, Cloneable {

    private Double a;

    private Double b;

    private String op;

    /**
     * @param a
     */

    public void setA(Double a) {
        this.a = a;
    }

    /**
     * @return
     */

    public Double getA() {
        return this.a;
    }

    /**
     * @param a
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input a(Double a) {
        setA(a);
        return this;
    }

    /**
     * @param b
     */

    public void setB(Double b) {
        this.b = b;
    }

    /**
     * @return
     */

    public Double getB() {
        return this.b;
    }

    /**
     * @param b
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input b(Double b) {
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

    public Input op(String op) {
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

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;
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
    public Input clone() {
        try {
            return (Input) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
