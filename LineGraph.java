import javax.swing.*;
import java.awt.*;

public class LineGraph
{
	LineGraph(){
		JFrame f= new JFrame();
		f.setTitle("��Ʈ���Ǻ� ȥ�⵵ �׷���");
		f.add(new LineGraphPanel());
		f.setSize(450,450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
