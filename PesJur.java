
package cadastrofisjur;


public class PesJur extends Pessoa{
    
   private String Cnpj;
   private String RazaoSocial;
   private String InscEstadual;
    
    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getInscEstadual() {
        return InscEstadual;
    }

    public void setInscEstadual(String InscEstadual) {
        this.InscEstadual = InscEstadual;
    }
   
    
    
}
