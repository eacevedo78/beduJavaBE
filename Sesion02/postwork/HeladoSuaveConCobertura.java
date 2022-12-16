public class CoberturaDecorator implements Helado{
  private Helado helado;

  public CoberturaDecorator(Helado helado){
    this.helado=helado;
  }

  @Override
  public String getDescripcion(){
    return helado.getDescripcion() + ", con Cobertura extra";
  }

  @Override
  public int getPrecio(){
    return helado.getPrecio() + 20;
  }
}
