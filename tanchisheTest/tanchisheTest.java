import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
class Configure //����ȫ�ֵĽ��档
{
	public static final int WIDTH = 400;
    public static final int HEIGTH = 300;
    // Height and width of window.
    public static final int TILE_WIDTH = 16;
    public static final int TILE_HEIGHT = 16;
    // The height and width of each snakePos.
    public static final int ROW = 15;
    public static final int COL = 20;
    // The number of rows and columns of the game.
    public static final int INTERVAL = 300;
    // Snake moving time interval.
}
enum Direction//����ö�����ͣ���߸����ʡ�
{
	UP,DOWN,RIGHT,LEFT;
}	
class SnakePos
{
	//����֮��һ����࣬ʵ���������configure�е�һ���㣬��Ҳ�����������н�Food�̳и��ࡣ
	public int col;
	public int row;
	SnakePos(int row,int col)
	{
		this.row=row;
		this.col=col;
	}
	SnakePos()
	{
		this.col=0;
		this.row=0;
	}
}
class Food extends SnakePos//�̳�SnakePos��ߴ���ĸ����ʡ�
{
	public static final int Row = Configure.ROW;
    public static final int Column = Configure.COL;
    // ��Configure���ж�ȡ����Ϸ���С�
	
}

class Snake
{
	private Direction snakeDir;
	private Direction moveDir;
	private Food food;
	private void randomPos()
	{
		this.row=(int)(Math.random()*ROW)
		this.col=(int)(Math.random()*COL)
	}
	Food()
	{
		this.randomPos();
	}
}















































































































































































































































