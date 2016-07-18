

package com.qq.client.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 * QQ客户端登陆界面
 * @author 李明
 *
 */
public class QqClientLogin extends JFrame {
	
	public static void main(String[] args) {
		QqClientLogin qqClientLogin = new QqClientLogin();
	}
	//定义头部组件定义头部组件定义头部组件定义头部组件
	JLabel jbll;
	
	//定义中间部分
	/*选项卡按钮*/
	JTabbedPane tap;//创建选项卡
	
	JPanel jp2,jp3,jp4;
	JLabel jp2_jlb1,jp2_jlb2,jp2_jlb3,jp2_jlb4;
	JTextField jp2_NoTxt;//创建文本输入框
	JPasswordField jp2_PassWordTxt;//创建密码框
	JButton jp2_clearBtn;//清除号码按钮
	JCheckBox jp2_jcb1,jp2_jcb2;//复选框 
	
	//定义底部组件
	JPanel jpll;
	JButton btn1,btn2,btn3;
	
	public QqClientLogin(){
		/*头部*/
		jbll = new JLabel(new ImageIcon("img/tou.gif"));
		
		/*中间*/
		jp2 = new JPanel(new GridLayout(3, 3));//QQ号码选项卡
		jp3 = new JPanel();
		jp4 = new JPanel();
		/*创建控件*/
		jp2_jlb1 = new JLabel("QQ号码：",JLabel.CENTER);
		jp2_jlb2 = new JLabel("QQ密码：",JLabel.CENTER);
		jp2_jlb3 = new JLabel("忘记密码",JLabel.CENTER);
		jp2_jlb3.setForeground(Color.BLUE);
		jp2_jlb4 = new JLabel("申请密码保护",JLabel.CENTER);
		jp2_jlb4.setForeground(Color.BLUE);
		jp2_clearBtn = new JButton(new ImageIcon("img/clear.gif"));
		jp2_NoTxt = new JTextField();//号码输入框
		jp2_PassWordTxt = new JPasswordField();//密码输入框
		jp2_jcb1 = new JCheckBox("隐身登陆");
		jp2_jcb2 = new JCheckBox("记住密码");
		/*把控件加入到jp2*/
		jp2.add(jp2_jlb1);
		jp2.add(jp2_NoTxt);
		jp2.add(jp2_clearBtn);
		jp2.add(jp2_jlb2);
		jp2.add(jp2_PassWordTxt);
		jp2.add(jp2_jlb3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jlb4);
		
		//创建选项卡
		tap = new JTabbedPane();
		tap.add("QQ号码", jp2);
		tap.add("手机号码", jp3);
		tap.add("电子邮箱", jp4);
		
		
		
		
		/*底部*/
		jpll = new JPanel();
		btn1 = new JButton(new ImageIcon("img/denglu.gif"));
		btn2 = new JButton(new ImageIcon("img/quxiao.gif"));
		btn3 = new JButton(new ImageIcon("img/xiangdao.gif"));
		
		//把按钮加入到jpll中
		jpll.add(btn1);
		jpll.add(btn2);
		jpll.add(btn3);
		
		this.add(jbll,"North");
		this.add(jpll,"South");
		this.add(tap,"Center");
		this.setSize(350, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
