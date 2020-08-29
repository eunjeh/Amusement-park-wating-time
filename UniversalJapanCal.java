import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class UniversalJapanCal extends JFrame implements ActionListener{
	JPanel panel1, panel2, panel3;
	JLabel label;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	JTextField txt;

	public static Random generator = new Random();

	int w1 = generator.nextInt(200) + 1;
	int w2 = generator.nextInt(200) + 1;
	int w3 = generator.nextInt(200) + 1;
	int w4 = generator.nextInt(200) + 1;
	int w5 = generator.nextInt(200) + 1;
	int w6 = generator.nextInt(200) + 1;
	int w7 = generator.nextInt(200) + 1;
	int w8 = generator.nextInt(200) + 1;

	int [] arr = {w1,w2,w3,w4,w5,w6,w7,w8};
	
	Color color=new Color(184, 221, 255);
	
	public UniversalJapanCal(String msg) {
		setTitle(msg);
		setSize(3000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1=new JPanel(new BorderLayout());
		panel1.setBackground(color);
		ImageIcon logo=new ImageIcon("US_japan_logo.png");
		label=new JLabel("함께 타고 싶은 일행의 인원을 적은 후, 대기 시간을 알고 싶은 놀이기구를 선택해주세요.");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		txt=new JTextField(10);
		
		panel2=new JPanel();
		panel3=new JPanel(new GridLayout(2, 4));
		panel2.setBackground(color);
		panel3.setBackground(color);
		
		add(panel2, BorderLayout.CENTER);
	
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		button1 = new JButton("초기화");
		button2 = new JButton("");
		button3 = new JButton("");
		button4 = new JButton("");
		button5 = new JButton("");
		button6 = new JButton("");
		button7 = new JButton("");
		button8 = new JButton("");
		button9 = new JButton("");
		
		ImageIcon icon1 = new ImageIcon("1.png");
		ImageIcon icon2 = new ImageIcon("2.png");
		ImageIcon icon3 = new ImageIcon("3.png");
		ImageIcon icon4 = new ImageIcon("4.png");
		ImageIcon icon5 = new ImageIcon("5.png");
		ImageIcon icon6 = new ImageIcon("6.png");
		ImageIcon icon7 = new ImageIcon("7.png");
		ImageIcon icon8 = new ImageIcon("8.png");
		
		button2.setIcon(icon1);
		button3.setIcon(icon2);
		button4.setIcon(icon3);
		button5.setIcon(icon4);
		button6.setIcon(icon5);
		button7.setIcon(icon6);
		button8.setIcon(icon7);
		button9.setIcon(icon8);
		     
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		label.setIcon(logo);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(panel1);
		
		panel1.add(label, BorderLayout.NORTH);
		panel2.add(txt);
		panel2.add(button1);
		panel1.add(panel2);
		panel2.add(panel3);
		
		panel3.add(button2);
		panel3.add(button3);
		panel3.add(button4);
		panel3.add(button5);
		panel3.add(button6);
		panel3.add(button7);
		panel3.add(button8);
		panel3.add(button9);

		setSize(3000, 1000);
		setVisible(true);
		setResizable(true);	
	}

	public int[] getWN(){
			return arr;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			txt.setText("");
		}else {
			String actionCommand=e.getActionCommand();
			txt.setText(txt.getText()+actionCommand);
			
			if(e.getSource()==button1) {
				setVisible(false);
				dispose();
				System.exit(0);
			}else if(e.getSource()==button2) {
				//해리포터 앤드 더 포비든 저니
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[0]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[0])/4*5+"분 예상됩니다.");
			}else if(e.getSource()==button3) {
				//헬로키티 컵케이크 드림
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[1]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[1])/60*1.5+"분 예상됩니다.");
			}else if(e.getSource()==button4) {
				//백 드래프트
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[2]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[2])/240*20+"분 예상됩니다.");
			}else if(e.getSource()==button5) {
				//스페이스 판타지 더 라이드
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[3]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[3])/8*10+"분 예상됩니다.");
			}else if(e.getSource()==button6) {
				//더 플라잉 다이너소어
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[4]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[4])/32*3+"분 예상됩니다.");
			}else if(e.getSource()==button7) {
				//미니언 메이헴
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[5]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[5])/8*18+"분 예상됩니다.");
			}else if(e.getSource()==button8) {
				//쥬라기 공원 더 라이드
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[6]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[6])/25*7+"분 예상됩니다.");
			}else if(e.getSource()==button9) {
				//어메이징 어드벤처 오브 스파이더맨 더 라이드
				int num=Integer.parseInt(txt.getText());
				JOptionPane.showMessageDialog(null, "현재 대기자: "+(arr[7]+num)+"명\n"+
				"대기 시간은 대략 "+(num+arr[7])/12*5+"분 예상됩니다.");
			}
		}
	}
}
