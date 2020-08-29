import javax.swing.*;
import java.awt.*;

public class LineGraph
{
	LineGraph(){
		JFrame f= new JFrame();
		f.setTitle("어트랙션별 혼잡도 그래프");
		f.add(new LineGraphPanel());
		f.setSize(450,450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
