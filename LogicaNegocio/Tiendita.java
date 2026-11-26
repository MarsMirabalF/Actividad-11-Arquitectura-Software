package LogicaNegocio ;

import java.util.ArrayList ;
import AccesoDatos.Juego ;
import AccesoDatos.Datos ;
import LogicaNegocio.Descuentos.TipoDesc ;
import LogicaNegocio.Observadores.Observador ;
import LogicaNegocio.TiposMensaje.Mensaje ;
import LogicaNegocio.TiposMensaje.MensajeSimple ;
import LogicaNegocio.TiposMensaje.ConHorita ;
import LogicaNegocio.TiposMensaje.ConMarquito ;

public class Tiendita{

  private Datos datos ;

  private TipoDesc tipoDesc ;

  private ArrayList < Observador > misObservadores ;

  public Tiendita( Datos datos , TipoDesc tipoDesc ){

    this.datos = datos ;

    this.tipoDesc = tipoDesc ;

    misObservadores = new ArrayList < Observador > ( ) ;

  }

  public void agregarObs( Observador obs ){

    misObservadores.add( obs ) ;

  }

  public void avisarComp( String juego , double total ){

    for( int i = 0 ; i < misObservadores.size( ) ; i++ ){

      misObservadores.get( i ).observador( juego , total ) ;

    }

  }

  public ArrayList < String > obtenerJuegos( ){

    ArrayList < String > lista = new ArrayList < String > ( ) ;

    ArrayList < Juego > juegos = datos.obtenerJuegos( ) ;

    for( int i = 0 ; i < juegos.size( ) ; i++ ){

      lista.add( juegos.get( i ).getNombre( ) + "   tiene Precio  :  " + juegos.get( i ).getPrecio( ) + " bolivianos" ) ;

    }

    return lista ;

  }

  public ArrayList < String > obtenerBiblioteca( ){

    return datos.obtenerJueguitos( ) ;

  }

  public Mensaje comprarJuego( int pos ){

    Juego juego = datos.obtenerJuegos( ).get( pos ) ;

    double descApli = tipoDesc.calcDescAplicado( juego.getPrecio( ) ) ;

    double total = juego.getPrecio( ) - descApli ;

    System.out.println( "Tu haz comprando el tremendo juegazo " + juego.getNombre( ) + " por " + total + " bolivianos (descuento " + tipoDesc.desc( ) + "%)" ) ;

    avisarComp( juego.getNombre( ) , total ) ;

    return new ConMarquito( new ConHorita( new MensajeSimple( "Compra realizada: " + juego.getNombre( ) ) ) ) ;

  }

}
