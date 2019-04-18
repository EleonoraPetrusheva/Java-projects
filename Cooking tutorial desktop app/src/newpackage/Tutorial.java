package newpackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tutorial extends JFrame
{
	int i=1;
	int a=1;
	JPanel jp = new JPanel();
	//JLabel jl3 = new JLabel();
	JPanel jp2 = new JPanel();
	JButton jb = new JButton("> ÑÀËÀÒÀ >");
	JButton jb2 = new JButton("< ÑÀËÀÒÀ <");
	JButton jb3 = new JButton("> ÎÑÍÎÂÍÎ >");
	JButton jb4 = new JButton("< ÎÑÍÎÂÍÎ <");
	JLabel jl = new JLabel();
	JLabel jl2 = new JLabel();
	JLabel jl3 = new JLabel();
	JLabel jl4 = new JLabel();
	//JLabel jl3 = new JLabel();
	
	public Tutorial()
	{
		setTitle("Íàðú÷íèê çà ãîòâåíå");
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//jb.setIcon(new ImageIcon("D:\\ProjPictures\\next.png\\"));
		jp.add(jb);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jl.setIcon(new ImageIcon("D:\\ProjPictures\\cezar.jpg\\"));
		jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto.jpg\\"));
		//jl3.setText("Èçáåðåòå ðåöåïòà");
		jp2.add(jl);
		jp2.add(jl2);
		add(jp2);
		
		
		jb.addActionListener(new ActionListener() { 
		

			public void actionPerformed(ActionEvent e)
			{
					switch(i++){
					case 1:
					jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 1st.jpg\\"));
					break;
					case 2:
					jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 2st.jpg\\"));
					break;
					case 3: 
					jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 3st.jpg\\"));
					break;
					case 4:
					jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 4st.jpg\\"));
					break;
//					default:
//					jl.setIcon(new ImageIcon ("D:\\ProjPictures\\cezar.jpg\\"));
//						break;
				}
				       //jp2.add(jl);

			}
			
		
			}); 

		add(jp, BorderLayout.SOUTH);
		add(jp2);
		
		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				{
						switch(i--){
						case 1:
						jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 1st.jpg\\"));
						break;
						case 2:
						jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 2st.jpg\\"));
						break;
						case 3: 
						jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 3st.jpg\\"));
						break;
						case 4:
						jl.setIcon(new ImageIcon ("D:\\ProjPictures\\salata 4st.jpg\\"));
						break;
						//default:
						//jl.setIcon(new ImageIcon ("D:\\ProjPictures\\cezar.jpg\\"));
							//break;
					}
					        //jp2.add(jl);
			}
			} });
		
		
		jb3.addActionListener(new ActionListener() { 
			

			public void actionPerformed(ActionEvent e)
			{
					switch(a++){
					case 1:
					jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto1st.jpg\\"));
					break;
					case 2:
					jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto2st.jpg\\"));
					break;
					case 3: 
					jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto3st.jpg\\"));
					break;
					case 4:
					jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto4st.jpg\\"));
					break;
					case 5:
						jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto5st.jpg\\"));
						break;
//					default:
//					jl.setIcon(new ImageIcon ("D:\\ProjPictures\\cezar.jpg\\"));
//						break;
				}
				        //jp2.add(jl2);

			}
			
		
			}); 
		jb4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				{
						switch(a--){
						case 1:
						jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto1st.jpg\\"));
						break;
						case 2:
						jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto2st.jpg\\"));
						break;
						case 3: 
						jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto3st.jpg\\"));
						break;
						case 4:
						jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto4st.jpg\\"));
						break;
						case 5:
							jl2.setIcon(new ImageIcon ("D:\\ProjPictures\\rizoto5st.jpg\\"));
							break;
						//default:
						//jl.setIcon(new ImageIcon ("D:\\ProjPictures\\cezar.jpg\\"));
							//break;
					}
					        //jp2.add(jl2);
			}
			} });
		//jp.setBackground(Color.PINK);
		//add(jp);
		
		validate();
	}
	
	public static void main(String[] args)
	{
		Tutorial t = new Tutorial();
	}
}
