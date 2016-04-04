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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
//VS4E -- DO NOT REMOVE THIS LINE!
public class Account extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton jButton4;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton0;
	private JButton jButton6;
	private JButton jButton5;
	private JLabel jL0;
	private JLabel jL1;
	private JLabel jL2;
	private JLabel jL4;
	private JLabel jL3;
	private JLabel jLabel6;
	private JButton jButton7;
	private JButton jButton9;
	private JButton jButton8;
	private JButton jButton11;
	public Account() {
		initComponents();
	}
	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel2(), new Constraints(new Leading(224, 12, 12), new Leading(110, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(50, 10, 10), new Leading(376, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(221, 12, 12), new Leading(212, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(228, 10, 10), new Leading(158, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(12, 116, 12, 12), new Leading(58, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(10, 116, 10, 10), new Leading(110, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(10, 116, 12, 12), new Leading(158, 12, 12)));
		add(getJButton6(), new Constraints(new Leading(10, 116, 12, 12), new Leading(207, 12, 12)));
		add(getJButton4(), new Constraints(new Leading(10, 12, 12), new Leading(258, 12, 12)));
		add(getJButton5(), new Constraints(new Leading(12, 116, 12, 12), new Leading(304, 12, 12)));
		add(getJButton11(), new Constraints(new Leading(10, 116, 12, 12), new Leading(350, 12, 12)));
		add(getJButton9(), new Constraints(new Leading(12, 12, 12), new Leading(462, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(330, 12, 12), new Leading(19, 14, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(224, 12, 12), new Leading(63, 12, 12)));
		add(getJButton7(), new Constraints(new Leading(228, 198, 12, 12), new Leading(396, 12, 12)));
		setSize(446, 513);
	}
	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setBackground(Color.red);
			jButton11.setText("本金估算");
			jButton11.addActionListener(this);
		}
		return jButton11;
	}

	
	

	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setText("清除");
			jButton8.addActionListener(this);
		}
		return jButton8;
	}

	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setText("菜单");
			jButton9.addActionListener(this);
		}
		return jButton9;
	}

	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBackground(Color.magenta);
			jButton7.setText("计算");
			jButton7.addActionListener(this);
		}
		return jButton7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
		}
		return jLabel6;
	}

	private JLabel getJLabel3() {
		if (jL3 == null) {
			jL3 = new JLabel();
			jL3.setForeground(Color.yellow);
			jL3.setText("年限");
		}
		return jL3;
	}

	private JLabel getJLabel4() {
		if (jL4 == null) {
			jL4 = new JLabel();
			jL4.setForeground(Color.yellow);
			jL4.setText("复利次数");
		}
		return jL4;
	}

	private JLabel getJLabel2() {
		if (jL2 == null) {
			jL2 = new JLabel();
			jL2.setBackground(Color.yellow);
			jL2.setForeground(Color.yellow);
			jL2.setText("年利率（%）");
		}
		return jL2;
	}

	private JLabel getJLabel1() {
		if (jL1 == null) {
			jL1 = new JLabel();
			jL1.setBackground(Color.black);
			jL1.setForeground(Color.yellow);
			jL1.setText("本金（元）");
		}
		return jL1;
	}

	private JLabel getJLabel0() {
		if (jL0 == null) {
			jL0 = new JLabel();
			jL0.setForeground(Color.yellow);
			jL0.setText("复利计算");
		}
		return jL0;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setBackground(Color.red);
			jButton5.setText("月年收益");
			jButton5.addActionListener(this);
		}
		return jButton5;
	}

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setBackground(Color.red);
			jButton6.setText("最佳年利率");
			jButton6.addActionListener(this);
		}
		return jButton6;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setBackground(Color.red);
			jButton0.setText("单利计算");
			jButton0.addActionListener(this);
		}
		return jButton0;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBackground(Color.red);
			jButton2.setText("年限计算");
			jButton2.addActionListener(this);
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBackground(Color.red);
			jButton1.setText("复利计算");
			jButton1.addActionListener(this);
		}
		return jButton1;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setBackground(Color.red);
			jButton4.setText("本额等息还款");
			jButton4.addActionListener(this);
		}
		return jButton4;
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
	Graphics g;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				Account frame = new Account();
				frame.setDefaultCloseOperation(Account.EXIT_ON_CLOSE);
				frame.setTitle("复利计算器<彩虹>");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	//是否显示窗体，以便需要时用到
	 	private void jt4Ture () {
	 		jT4.setVisible(true);
	 		jL4.setVisible(true);
	 	}
	 	private void jt4False () {
	 		jT4.setVisible(false);
	 		jL4.setVisible(false);
	 	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getActionCommand().equals("单利计算")) {
 			initialise();
 			jL0.setText("单利计算");
 			jL1.setText("本金<元>：");
 			jL2.setText("项目利率<%>：");
 			jL3.setText("年限：");
 			jt4False();
 
 		} else if(e.getActionCommand().equals("复利计算")) {
 			jL0.setText("复利计算");
 			initialise();
 			jL1.setText("本金<元>：");
 			jL2.setText("年利率<%>：");
 			jL3.setText("年限：");
 			jL4.setText("复利次数：");
 			jt4Ture();	
 
 		} else if(e.getActionCommand().equals("年限计算")) {
 			jL0.setText("年限计算");
 			initialise();
 			jL3.setText("最终受益：");
 			jL1.setText("本金<元>：");
 			jL2.setText("年利率<%>：");
 			jL4.setText("复利次数：");
 			jt4Ture();
 
 		} else if(e.getActionCommand().equals("月年收益")){
 			jL0.setText("月年收益");
 			initialise();
 			jL1.setText("每月投资<元>：");
 			jL2.setText("年利率<%>：");
 			jL3.setText("年限：");
 			jt4False();
 			
 		} else if(e.getActionCommand().equals("本金估算")) {		
 			jL0.setText("本金估算");
 			initialise();
 			jL1.setText("本利和<元>：");
 			jL2.setText("年利率<%>：");
 			jL3.setText("年限：");
 			jL4.setText("复利次数：");
 			jt4Ture();
 
 		} else if(e.getActionCommand().equals("本额等息还款")) {
 			jL0.setText("本额等息还款");
 			initialise();
 			jL1.setText("贷款金额<元>：");
 			jL2.setText("本利和<元>：");
 			jL3.setText("年限：");
 			jt4False();
 
 		} 
 		else if(e.getActionCommand().equals("惊喜"))
 		{
 			jL0.setText("惊喜");
 		}
 		else if(e.getActionCommand().equals("最佳年利率")) {
 			jL0.setText("最佳年利率");
 			initialise();
 			jL1.setText("本金<元>：");
 			jL2.setText("本利和<%>：");
 			jL3.setText("年限：");
 			jL4.setText("复利次数：");
 			jt4Ture();
 
 		} else if(e.getActionCommand().equals("计算")) {
 			if(jT1.getText().trim().equals("") || jT2.getText().trim().equals("") ||jT3.getText().trim().equals("") ){
 				JOptionPane jo = new JOptionPane();
 				jo.showMessageDialog(null,"请输入数值!");
 			}	else {
 				NowAccount ();
 			}
 	
 		}else if(e.getActionCommand().equals("清除")) {
 			initialise();
 		}
 
 	}
 	private void NowAccount() {
		// TODO 自动生成的方法存根
 		
 	 		//System.out.print("234324");
 	 		if(jL0.getText() == "单利计算") {
 	 			String strPrincipal = jT1.getText() ;
 	 			String strRate = jT2.getText() ;
 				String strTime = jT3.getText() ;
 	 			SingleAccount single = new SingleAccount(strRate, strPrincipal, strTime);
 				double f = single.Account();
 	 			jT5.setText(String.valueOf(f));
 	 		}
 	 		else if(jL0.getText() == "复利计算") {
 	 			NumberFormat currencyformatter=NumberFormat.getCurrencyInstance();
 	 			System.out.print("---------");
 	 			String strPrincipal = jT1.getText() ;
 	 			String strRate = jT2.getText() ;
 	 			String strTime = jT3.getText() ;
 	 			String strCount = jT4.getText() ;
 	 			CompoundAccount compound = new CompoundAccount(strRate, strPrincipal, strTime,strCount);
 	 			double f = compound.Account();
 	 			//jT5.setText(String.valueOf(f));
 	 			jT5.setText(currencyformatter.format(f)+"\n");
 	 		} else if(jL0.getText() == "年限计算") {
 	 			String strPrincipal = jT1.getText() ;
 	 			String strRate = jT2.getText() ;
 	 			String strEarnings = jT3.getText() ;
 	 			String strCount = jT4.getText() ;
 	 			TimeAccount time = new TimeAccount(strRate, strPrincipal, strEarnings, strCount);
 	 			int t = time.Account();
 	 			jT5.setText(String.valueOf(t)+"年");
 	 		} else if(jL0.getText() == "月年收益"){
 	 			String strInvestment = jT1.getText() ;
 	 			String strRate = jT2.getText() ;
 	 			String strTime = jT3.getText() ;
 	 			//String strCount = jt4.getText() ;
 	 			YearIncome compound = new YearIncome(strRate, strInvestment, strTime);
 	 			double f = compound.Account();
 	 			jT5.setText(String.valueOf(f));
 	 			
 	 		} else if(jL0.getText() == "本金估算") {
 	 			//System.out.print("---------");
 	 			String strEarnings = jT1.getText() ;
 	 			String strRate = jT2.getText() ;
 	 			String strTime = jT3.getText() ;
 	 			String strCount = jT4.getText() ;
 	 			PrincipalAccount compound = new PrincipalAccount(strRate, strEarnings, strTime,strCount);
 	 			double f = compound.Account();
 	 			jT5.setText(String.valueOf(f));
 	 			
 	 		} else if(jL0.getText() == "本额等息还款") {
 	 			String strLoan = jT1.getText() ;
 	 			String strRate = jT2.getText() ;
 	 			String strTime = jT3.getText() ;
 	 
 	 			fundAccount single = new fundAccount(strRate, strLoan, strTime);
 	 			double f = single.Account();
 	 			jT5.setText(String.valueOf(f));
 	 			
 	 		} 
 	 		else if(jL0.getText() == "惊喜"){
 	 			
 	 		//	g.drawImage(img, x, y, width, height, bgcolor, observer)
 	 			ImageIcon imageicon=new ImageIcon("G:/Test/iamge/2.jpg");
 	 			Image image=imageicon.getImage();
 	 			image=image.getScaledInstance(18, 18, Image.SCALE_DEFAULT);
 	 			imageicon.setImage(image);
 	 			
				
 	 		}
 	 		
 	 		else if(jL0.getText() == "最佳年利率") {
 	 			String strEarnings = jT1.getText() ;
 	 			String strstrPrincipal = jT2.getText() ;
 	 			String strTime = jT3.getText() ;
 	 			String strCount = jT4.getText() ;
 	 			BestEfficiency compound = new BestEfficiency(strstrPrincipal, strEarnings, strTime,strCount);
 	 			double f = compound.Account();
 	 			jT5.setText(String.valueOf(f));
 	 			
 	 		}
 	 		
 	 	}
		
	

	private void initialise(){
 		 jT1.setText(null); 
 		 jT2.setText(null); 
 		 jT3.setText(null); 
 		 jT4.setText(null); 
 		 jT5.setText(null); 
 		
 	}
 	
		
	}


