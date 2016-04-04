package account;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class Account1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JButton jButton0;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private JLabel jL0;
	private JLabel jL1;
	private JLabel jL2;
	private JLabel jL3;
	private JLabel jL4;
	private JLabel jL5;
	private JTextField jT1;
	private JTextField jT2;
	private JTextField jT3;
	private JTextField jT4;
	private JTextField jT5;
	private JButton jButton8;
	private JButton jButton9;
	private JButton jButton10;
	private JButton jButton11;
	private JButton jButton12;
	private JButton jButton13;
	public Account1() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Bilateral(0, 0, 0), new Leading(0, 490, 10, 10)));
		setSize(462, 492);
	}

	
	private JButton getJButton13() {
		if (jButton13 == null) {
			jButton13 = new JButton();
			jButton13.setText("惊喜");
			jButton13.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton13ActionActionPerformed(event);
				}
			});
		}
		return jButton13;
	}

	private JButton getJButton12() {
		if (jButton12 == null) {
			jButton12 = new JButton();
			jButton12.setBackground(new Color(255, 128, 0));
			jButton12.setText("定投收益");
			jButton12.addActionListener(this);
		}
		return jButton12;
	}

	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setBackground(new Color(255, 0, 128));
			jButton11.setText("清除");
			jButton11.addActionListener(this);
		}
		return jButton11;
	}

	private JButton getJButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setBackground(Color.red);
			jButton10.setText("计算");
			jButton10.addActionListener(this);
		}
		return jButton10;
	}

	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setText("关于");
			jButton9.addActionListener(this);
		}
		return jButton9;
	}

	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setText("菜单");
			
		}
		return jButton8;
	}

	private JTextField getJTextField4() {
		if (jT5 == null) {
			jT5 = new JTextField();
		}
		return jT5;
	}

	private JTextField getJTextField3() {
		if (jT4 == null) {
			jT4 = new JTextField();
		}
		return jT4;
	}

	private JTextField getJTextField2() {
		if (jT3 == null) {
			jT3 = new JTextField();
		}
		return jT3;
	}

	private JTextField getJTextField1() {
		if (jT2 == null) {
			jT2 = new JTextField();
		}
		return jT2;
	}

	private JTextField getJTextField0() {
		if (jT1 == null) {
			jT1 = new JTextField();
		}
		return jT1;
	}

	private JLabel getJLabel5() {
		if (jL5 == null) {
			jL5 = new JLabel();
			jL5.setForeground(Color.green);
			jL5.setText("终值：");
		}
		return jL5;
	}

	private JLabel getJLabel4() {
		if (jL4 == null) {
			jL4 = new JLabel();
			jL4.setForeground(Color.green);
			jL4.setText("复利次数：");
		}
		return jL4;
	}

	private JLabel getJLabel3() {
		if (jL3 == null) {
			jL3 = new JLabel();
			jL3.setForeground(Color.green);
			jL3.setText("年限：");
		}
		return jL3;
	}

	private JLabel getJLabel2() {
		if (jL2 == null) {
			jL2 = new JLabel();
			jL2.setForeground(Color.green);
			jL2.setText("年利率：");
		}
		return jL2;
	}

	private JLabel getJLabel1() {
		if (jL1 == null) {
			jL1 = new JLabel();
			jL1.setForeground(Color.green);
			jL1.setText("本金：");
		}
		return jL1;
	}

	private JLabel getJLabel0() {
		if (jL0 == null) {
			jL0 = new JLabel();
			jL0.setForeground(new Color(128, 255, 0));
			jL0.setText("复利计算");
		}
		return jL0;
	}

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setBackground(new Color(255, 128, 0));
			jButton6.setText("本金估算");
			jButton6.addActionListener(this);
		}
		return jButton6;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("月年收益");
			jButton5.addActionListener(this);
		}
		return jButton5;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setBackground(new Color(255, 128, 0));
			jButton4.setText("本额等息还款");
			jButton4.addActionListener(this);
		}
		return jButton4;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setBackground(new Color(255, 128, 0));
			jButton3.setText("最佳年利率");
			jButton3.addActionListener(this);
		}
		return jButton3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBackground(new Color(255, 128, 0));
			jButton2.setText("年限计算");
			jButton2.addActionListener(this);
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBackground(new Color(255, 128, 0));
			jButton1.setText("复利计算");
			jButton1.addActionListener(this);
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setBackground(new Color(255, 128, 0));
			jButton0.setText("单利计算");
			jButton0.addActionListener(this);
		}
		return jButton0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBackground(Color.black);
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel0(), new Constraints(new Leading(304, 10, 10), new Leading(26, 12, 12)));
			jPanel0.add(getJButton3(), new Constraints(new Leading(12, 116, 12, 12), new Leading(219, 10, 10)));
			jPanel0.add(getJButton2(), new Constraints(new Leading(12, 116, 12, 12), new Leading(163, 10, 10)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(12, 116, 12, 12), new Leading(115, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(208, 10, 10), new Leading(69, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(204, 10, 10), new Leading(115, 12, 12)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(208, 12, 12), new Leading(222, 10, 10)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(208, 12, 12), new Leading(270, 10, 10)));
			jPanel0.add(getJButton4(), new Constraints(new Leading(12, 116, 12, 12), new Leading(272, 10, 10)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(214, 12, 12), new Leading(173, 12, 12)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(276, 136, 10, 10), new Leading(69, 12, 12)));
			jPanel0.add(getJTextField2(), new Constraints(new Leading(276, 140, 12, 12), new Leading(169, 12, 12)));
			jPanel0.add(getJTextField3(), new Constraints(new Leading(278, 136, 12, 12), new Leading(219, 12, 12)));
			jPanel0.add(getJTextField1(), new Constraints(new Leading(276, 136, 12, 12), new Leading(115, 12, 12)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(13, 116, 12, 12), new Leading(64, 12, 12)));
			jPanel0.add(getJButton6(), new Constraints(new Leading(13, 116, 12, 12), new Leading(329, 10, 10)));
			jPanel0.add(getJButton12(), new Constraints(new Leading(12, 116, 12, 12), new Leading(380, 10, 10)));
			jPanel0.add(getJTextField4(), new Constraints(new Leading(278, 141, 10, 10), new Leading(268, 55, 12, 12)));
			jPanel0.add(getJButton10(), new Constraints(new Leading(277, 142, 12, 12), new Leading(356, 10, 10)));
			jPanel0.add(getJButton11(), new Constraints(new Leading(277, 142, 12, 12), new Leading(402, 12, 12)));
			jPanel0.add(getJButton13(), new Constraints(new Leading(349, 10, 10), new Leading(452, 10, 10)));
			jPanel0.add(getJButton9(), new Constraints(new Leading(203, 12, 12), new Leading(455, 10, 10)));
			jPanel0.add(getJButton8(), new Constraints(new Leading(49, 10, 10), new Leading(458, 10, 10)));
		}
		return jPanel0;
	}

	Image backing;
	Image overing;
     int x=0,y=0;
    Graphics g;
	public void addpicture()
	{
		
		g=this.jPanel0.getGraphics();
		backing=new ImageIcon("C:\\Users\\lenovo\\Desktop\\3.jpg").getImage();
		g.drawImage(backing, x, y, 500, 500, null);
	}
	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	private JPanel jPanel1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Account1 frame = new Account1();
				frame.setDefaultCloseOperation(Account1.EXIT_ON_CLOSE);
				frame.setTitle("复利计算器<彩虹>");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	private void jt4Ture () {
 		jT4.setVisible(true);
 		jL4.setVisible(true);
 	}
 	private void jt4False () {
 		jT4.setVisible(false);
 		jL4.setVisible(false);
 	}
 
 	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent a) {
 		// TODO 自动生成的方法存根
 		if(a.getActionCommand().equals("单利计算")) {
 			initialise();
 			jL0.setText("单利计算");
 			jL1.setText("本金：");
 			jL2.setText("年利率：");
 			jL3.setText("年限：");
 			jt4False();
 
 		} else if(a.getActionCommand().equals("复利计算")) {
 			jL0.setText("复利计算");
 			initialise();
 			jL1.setText("本金：");
 			jL2.setText("年利率：");
 			jL3.setText("年限：");
 			jL4.setText("复利次数：");
 			jt4Ture();	
 
 		} else if(a.getActionCommand().equals("年限计算")) {
 			jL0.setText("年限计算");
 			initialise();
 			jL3.setText("本利和：");
 			jL1.setText("本金：");
 			jL2.setText("年利率：");
 			jL4.setText("复利次数：");
 			jt4Ture();
 
 		} else if(a.getActionCommand().equals("定投收益")){
 			jL0.setText("定投收益");
 			initialise();
 			jL1.setText("每月投资：");
 			jL2.setText("年利率：");
 			jL3.setText("年限：");
 			jt4False();
 			
 		} else if(a.getActionCommand().equals("本金估算")) {		
 			jL0.setText("本金估算");
 			initialise();
 			jL1.setText("本利和：");
 			jL2.setText("年利率：");
 			jL3.setText("年限：");
 			jL4.setText("复利次数：");
 			jt4Ture();
 
 		} else if(a.getActionCommand().equals("本额等息还款")) {
 			jL0.setText("本额等息还款");
 			initialise();
 			jL1.setText("贷款金额：");
 			jL2.setText("本利和：");
 			jL3.setText("年限：");
 			jt4False();
 
 		} else if(a.getActionCommand().equals("最佳年利率")) {
 			jL0.setText("年利率");
 			initialise();
 			jL1.setText("本金：");
 			jL2.setText("本利和：");
 			jL3.setText("年限：");
 			jL4.setText("复利次数：");
 			jt4Ture();
 
 		} 
 		else if(a.getActionCommand().equals("菜单"))
 		{//单利计算，复利计算，年限计算，最佳年利率，定投收益，本金估算，本额等息还款
 			
 			
 		       JOptionPane jo1 = new JOptionPane();
 				jo1.showMessageDialog(null,"功能有：!");
 			
 		}
 		else if(a.getActionCommand().equals("计算")) {
 			if(jT1.getText().trim().equals("") || jT2.getText().trim().equals("") ||jT3.getText().trim().equals("") ){
 				JOptionPane jo = new JOptionPane();
 				jo.showMessageDialog(null,"请输入数值!");
 			}	else {
 				
 				interest ();
 			}
 	
 		}else if(a.getActionCommand().equals("清除")) {
 			initialise();
 		}
 
 	}
 	private void initialise(){
 		 jT1.setText(null); 
 		 jT2.setText(null); 
 		 jT3.setText(null); 
 		 jT4.setText(null); 
 		 jT5.setText(null); 
 		
 	}
 	
 	private void interest () {
 		//System.out.print("234324");
 		NumberFormat currencyformatter=NumberFormat.getCurrencyInstance();
 		if(jL0.getText() == "单利计算") {
 			String Principal = jT1.getText() ;
 			String Rate = jT2.getText() ;
			String Time = jT3.getText() ;
 			SingleAccount single = new SingleAccount(Rate, Principal, Time);
			double f = single.Account();
 			//jT5.setText(String.valueOf(f));
			jT5.setText(String.valueOf(currencyformatter.format(f)+"\n"));
 		}
 		else if(jL0.getText() == "复利计算") {
 			System.out.print("---------");
 			String Principal = jT1.getText() ;
 			String Rate = jT2.getText() ;
 			String Time = jT3.getText() ;
 			String Count = jT4.getText() ;
 			CompoundAccount compound = new CompoundAccount(Rate, Principal, Time,Count);
 			double f = compound.Account();
 			jT5.setText(String.valueOf(currencyformatter.format(f)+"\n"));
 			
 		} else if(jL0.getText() == "年限计算") {
 			String Principal = jT1.getText() ;
 			String Rate = jT2.getText() ;
 			String Earnings = jT3.getText() ;
 			String Count = jT4.getText() ;
 			TimeAccount time = new TimeAccount(Rate, Principal, Earnings, Count);
 			int t = time.Account();
 			jT5.setText("     "+"时间为："+String.valueOf(t)+"年");
 		} else if(jL0.getText() == "定投收益"){
 			String Investment = jT1.getText() ;
 			String Rate = jT2.getText() ;
 			String Time = jT3.getText() ;
 			YearIncome compound = new YearIncome(Rate, Investment, Time);
 			double f = compound.Account();
 			jT5.setText(String.valueOf(currencyformatter.format(f)+"\n"));
 			
 		} else if(jL0.getText() == "本金估算") {
 			String Earnings = jT1.getText() ;
 			String Rate = jT2.getText() ;
 			String Time = jT3.getText() ;
 			String Count = jT4.getText() ;
 			PrincipalAccount compound = new PrincipalAccount(Rate, Earnings, Time,Count);
 			double f = compound.Account();
 			jT5.setText(String.valueOf(currencyformatter.format(f)+"\n"));
 			
 		} else if(jL0.getText() == "本额等息还款") {
 			String Loan = jT1.getText() ;
 			String Rate = jT2.getText() ;
 			String Time = jT3.getText() ;
 			fundAccount single = new fundAccount(Rate, Loan, Time);
 			double f = single.Account();
 			jT5.setText(String.valueOf(currencyformatter.format(f)+"\n"));
 		} else if(jL0.getText() == "最佳年利率") {
 			String Earnings = jT1.getText() ;
 			String Principal = jT2.getText() ;
 			String Time = jT3.getText() ;
 			String Count = jT4.getText() ;
 			BestEfficiency compound = new BestEfficiency(Principal, Earnings, Time,Count);
 			double f = compound.Account();
 			jT5.setText(String.valueOf(f));
 			
 		}
 		
 	}

	private void jButton13ActionActionPerformed(ActionEvent event) {
		addpicture();
		
	}

}
