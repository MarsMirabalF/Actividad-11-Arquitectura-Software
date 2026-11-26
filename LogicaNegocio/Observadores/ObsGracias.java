package LogicaNegocio.Observadores ;

public class ObsGracias implements Observador{

  public void observador( String juego , double total ){

    System.out.println( "Compra exitosa del jueguito " + juego + " no se olvide de jugarlo :v" ) ;

  }

}
