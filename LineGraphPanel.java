import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LineGraphPanel extends JPanel
{
	public LineGraphPanel (){
	}

	public void paintComponent(Graphics g){

		UniversalJapanCal w = new UniversalJapanCal("Universal Studio Japan 대기시간 계산기 (류은제, 이유정, 최유진)");

		int[] arr2 = w.getWN();

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Graphics2D g3 = (Graphics2D) g;
		
		g2.setColor(Color.BLACK);
		g2.drawLine(25,10,25,360);		//y축
		g2.drawLine(25,360,450,360);	//x축

		//눈금 그리기-y축
		g2.drawLine(20,10,30,10); g2.drawString("350",0,15);
		g2.drawLine(20,60,30,60); g2.drawString("300",0,65);
		g2.drawLine(20,110,30,110); g2.drawString("250",0,115);
		g2.drawLine(20,160,30,160); g2.drawString("200",0,165);
		g2.drawLine(20,210,30,210); g2.drawString("150",0,215);
		g2.drawLine(20,260,30,260); g2.drawString("100",0,265);
		g2.drawLine(20,310,30,310); g2.drawString("50",0,315);
		g2.drawLine(20,360,30,360); g2.drawString("0",0,375);

		//눈금 그리기-x축
		g2.drawString("but1",40,370); 
		g2.drawString("but2",90,370); 
		g2.drawString("but3",140,370); 
		g2.drawString("but4",190,370); 
		g2.drawString("but5",240,370); 
		g2.drawString("but6",290,370); 
		g2.drawString("but7",340,370); 
		g2.drawString("but8",400,370); 
		
		//막대 그래프 그리기
		g3.setColor(Color.PINK);
		g3.fillRect(40, 360-(arr2[0])/4*5, 30, (arr2[0])/4*5);
		g3.fillRect(90, 360-(arr2[1])/60*2, 30, (arr2[1])/60*2);
		g3.fillRect(140, 360-(arr2[2])/240*20, 30, (arr2[2])/240*20);
		g3.fillRect(190, 360-(arr2[3])/8*10, 30, (arr2[3])/8*10);
		g3.fillRect(240, 360-(arr2[4])/32*3, 30, (arr2[4])/32*3);
		g3.fillRect(290, 360-(arr2[5])/8*18, 30, (arr2[5])/8*18);
		g3.fillRect(340, 360-(arr2[6])/25*7, 30, (arr2[6])/25*7);
		g3.fillRect(400, 360-(arr2[7])/12*5, 30, (arr2[7])/12*5);
	}
}