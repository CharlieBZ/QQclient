

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
 * QQ�ͻ��˵�½����
 * @author ����
 *
 */
public class QqClientLogin extends JFrame {
	
	public static void main(String[] args) {
		QqClientLogin qqClientLogin = new QqClientLogin();
	}
	//����ͷ���������ͷ���������ͷ���������ͷ�����
	JLabel jbll;
	
	//�����м䲿��
	/*ѡ���ť*/
	JTabbedPane tap;//����ѡ�
	
	JPanel jp2,jp3,jp4;
	JLabel jp2_jlb1,jp2_jlb2,jp2_jlb3,jp2_jlb4;
	JTextField jp2_NoTxt;//�����ı������
	JPasswordField jp2_PassWordTxt;//���������
	JButton jp2_clearBtn;//������밴ť
	JCheckBox jp2_jcb1,jp2_jcb2;//��ѡ�� 
	
	//����ײ����
	JPanel jpll;
	JButton btn1,btn2,btn3;
	
	public QqClientLogin(){
		/*ͷ��*/
		jbll = new JLabel(new ImageIcon("img/tou.gif"));
		
		/*�м�*/
		jp2 = new JPanel(new GridLayout(3, 3));//QQ����ѡ�
		jp3 = new JPanel();
		jp4 = new JPanel();
		/*�����ؼ�*/
		jp2_jlb1 = new JLabel("QQ���룺",JLabel.CENTER);
		jp2_jlb2 = new JLabel("QQ���룺",JLabel.CENTER);
		jp2_jlb3 = new JLabel("��������",JLabel.CENTER);
		jp2_jlb3.setForeground(Color.BLUE);
		jp2_jlb4 = new JLabel("�������뱣��",JLabel.CENTER);
		jp2_jlb4.setForeground(Color.BLUE);
		jp2_clearBtn = new JButton(new ImageIcon("img/clear.gif"));
		jp2_NoTxt = new JTextField();//���������
		jp2_PassWordTxt = new JPasswordField();//���������
		jp2_jcb1 = new JCheckBox("�����½");
		jp2_jcb2 = new JCheckBox("��ס����");
		/*�ѿؼ����뵽jp2*/
		jp2.add(jp2_jlb1);
		jp2.add(jp2_NoTxt);
		jp2.add(jp2_clearBtn);
		jp2.add(jp2_jlb2);
		jp2.add(jp2_PassWordTxt);
		jp2.add(jp2_jlb3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jlb4);
		
		//����ѡ�
		tap = new JTabbedPane();
		tap.add("QQ����", jp2);
		tap.add("�ֻ�����", jp3);
		tap.add("��������", jp4);
		
		
		
		
		/*�ײ�*/
		jpll = new JPanel();
		btn1 = new JButton(new ImageIcon("img/denglu.gif"));
		btn2 = new JButton(new ImageIcon("img/quxiao.gif"));
		btn3 = new JButton(new ImageIcon("img/xiangdao.gif"));
		
		//�Ѱ�ť���뵽jpll��
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
