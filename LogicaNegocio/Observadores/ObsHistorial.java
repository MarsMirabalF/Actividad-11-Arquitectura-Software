package LogicaNegocio.Observadores ;

import AccesoDatos.Datos ;

public class ObsHistorial implements Observador{

  private Datos datos ;

  public ObsHistorial( Datos datos ){

    this.datos = datos ;

  }

  public void observador( String juego , double total ){

    datos.agregarJueguito( "Compraste el " + juego + " por " + total + " bolivianos" ) ;

  }

}
