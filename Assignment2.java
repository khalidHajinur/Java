import  java.awt.Frame;
import  java.awt.Panel;
import  java.awt.GridLayout;
import  java.awt.Label;
import  java.awt.TextField;
import  java.awt.TextArea;
import  java.awt.Color;
import  java.awt.Font;
import  java.awt.Button;
import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import  java.io.PrintStream;
public class Assignment2
{
	public static void main( String[] args)
	{
		FrameAndPanels frame = new FrameAndPanels();
		frame.setTitle(" Stopping Distance");
		frame.setVisible(true);

		PrintStream output = new PrintStream ( System.out);
	}
}
 class FrameAndPanels extends Frame implements ActionListener
{
	public FrameAndPanels()
	{
		final int DEFAULT_FRAME_WIDTH = 350;
		final int DEFAULT_FRAME_HEIGHT = 400;
		setSize( DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT );
		// use gridlayout
		panel1 =new Panel();
		panel1.setLayout( new GridLayout( 5, 2));
		// add components to frame
		Label startlb = new Label("Start");
		panel1.add(startlb);
		startTemp= new TextField();
		panel1.add( startTemp);
		panel1.add(new Label("End"));
		endTemp=new TextField();
		panel1.add( endTemp);
		panel1.add(new Label("Increment"));
		incrementTemp=new TextField();
		panel1.add(incrementTemp);
		clear = new Button("Clear");
		clear.addActionListener(this);
		panel1.add( clear);
		table = new Button("Table");
		table.addActionListener(this);
		panel1.add(table);
		exit = new Button("Exit");
		exit.addActionListener(this);
		panel1.add( exit);
		panel2 = new Panel();
		panel2.setLayout(new GridLayout(1, 1));
		text= new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		text.setFont(new Font("Courier", Font.PLAIN, 18));
		text.setEditable(false);
		panel2.add(text);
		setLayout(new GridLayout(2,1));
		add(panel1);
		add(panel2);
	}
	//method used for mouse clicks on buttons
	public void actionPerformed( ActionEvent e)
	{

		if(e.getSource()== table)
		{
				if(!validate.checkInt(startTemp.getText()))
			{
				text.append("error start value should be Integer\n");
				return;
			}
				if((startTemp.getText()).length()==0) 
			{
				text.append("error No value in start\n");
				return;
			}
			if(!validate.checkInt(endTemp.getText()))
			{
				text.append("error End should be a Integer\n");
				return;
			}
			if((endTemp.getText()).length()==0) 
			{
				text.append("error No value in End\n");
				return;
			}
			if(!validate.checkInt(incrementTemp.getText()))
			{
				text.append("error please only increment with a valid Integer\n");
				return;
			}

			if((incrementTemp.getText()).length()==0) 
			{
				text.append("error No value in increment\n");
				return;
			}
			int startvalue = Integer.parseInt(startTemp.getText());
			int endvalue = Integer.parseInt(endTemp.getText());
			int incrementValue = Integer.parseInt(incrementTemp.getText());


			if(startvalue > endvalue )
			{
				text.append("start value greater than end value\n");
				return;
			}
			if(incrementValue > endvalue)
			{
				text.append("Increment value greater than end value\n");
			}
			

			int centStart =  Integer.parseInt(startTemp.getText());
			int centEnd =  Integer.parseInt(endTemp.getText());
			int centIncrement =  Integer.parseInt(incrementTemp.getText());
			text.append("*******************************"+"\n");
			text.append("* Speed(mph) * Distance(feet) *"+"\n");
			text.append("*******************************"+"\n");
			for(int i=centStart; i<=centEnd; i+=centIncrement)
			{
				int distance=( i * i )/20+i ;
				String data = String.format("*    %3d     *   %5d        * \n", i, distance);
				text.append(data);


			}
			text.append("*******************************"+"\n");


		}
		else if (e.getSource() == clear)
		{
			startTemp.setText(" ");
			endTemp.setText(" ");
			incrementTemp.setText(" ");
			text.setText(" ");
			startTemp.setText("");
			endTemp.setText("");
			incrementTemp.setText("");
			text.setText("");
		}
		else if(e.getSource()== exit)
		{
			System.exit(0);
		}
	}
	// instance variables
	private TextField startTemp, endTemp, incrementTemp;
	private Button table,  clear, exit;
	private TextArea text;
	private Panel panel1, panel2;
}