import javax.swing.*;
import javax.swing.event.*;

class ListDemo extends JFrame implements ListSelectionListener
{
	JList lst;
	JScrollPane jsp;
	JTextField tf;

	ListDemo()
	{
		setLayout(null);

		String s[]={"C","C++","Java","PHP","Python","DS","OS"};

		lst=new JList(s);
		lst.addListSelectionListener(this);
		lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
							//SINGLE_SELECTION

		jsp=new JScrollPane(lst);
		jsp.setSize(200,100);
		jsp.setLocation(50,30);
		add(jsp);

		tf=new JTextField();
		tf.setSize(270,30);
		tf.setLocation(10,180);
		add(tf);

		setTitle("List Demo");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent le)
	{
		Object s[]=lst.getSelectedValues();

		String line="";

		for(int i=0;i<s.length;i++)
		{
			line=line+(String)s[i]+" ";
		}
		tf.setText(line);
	}
	public static void main(String args[])
	{
		ListDemo ob = new ListDemo();
	}
}