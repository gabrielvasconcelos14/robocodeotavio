package altolage;
import robocode.*;
import java.awt.Color;
/**
 * Altolage - a class by (gabrielvazz)
 */
public class Altolage extends Robot {
 public void run() {        
  setColors(Color.red,Color.black,Color.black,Color.red,Color.red);
 // repetição   
   while (true){
 // andar pra frente   
      ahead(80);
	  // giro de 90º a direita
	  turnRight(90); 
    }
}
    public void onScannedRobot(ScannedRobotEvent e) {
		//controlar os inimigos pela distancia
		//nome do robo dectado no radar e armazena ele
       String roboal = e.getName();
	   //distancia em pixels do inimigo
		double distancias = e.getDistance();
		System.out.println(roboal + " distancias " + distancias);
		//se for menor que 150 utilizar o poder de fogo 3
      if (distancias < 150){
		  fire(3);
		  //se n for menor utilizar o poder de fogo 1
	  } else {
		  fire(1);
	  }
	  
	}
	// em casa de bater na parede da arena
	public void onHitWall(HitWallEvent e){ 
		back(50);
		turnRight(90);
	}
}









