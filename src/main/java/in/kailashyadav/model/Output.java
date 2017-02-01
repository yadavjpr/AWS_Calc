/**
 * null
 */
package in.kailashyadav.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/uf7uohk96b-2017-02-01T18:18:55Z/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable {

    private Double c;

    /**
     * @param c
     */

    public void setC(Double c) {
        this.c = c;
    }

    /**
     * @return
     */

    public Double getC() {
        return this.c;
    }

    /**
     * @param c
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output c(Double c) {
        setC(c);
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
        if (getC() != null)
            sb.append("C: ").append(getC());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getC() == null ^ this.getC() == null)
            return false;
        if (other.getC() != null && other.getC().equals(this.getC()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getC() == null) ? 0 : getC().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
