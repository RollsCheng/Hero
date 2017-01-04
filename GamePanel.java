package com.darene;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.tarena.util.ImageUtil;

public class GamePanel extends JPanel{
	Hero h = new Hero();
	
	void paintBackGround(Graphics g){
		/*
		 * BUffered这个方法是绘制游戏背景
		 * g是画笔
		 */
		BufferedImage image = ImageUtil.load("IMG_3675.JPG");
		g.drawImage(image, 0, 0, null);
	}
	//绘制游戏得分和生命
	void paintScoreAndLife(Graphics g){
		g.drawString("SCORE:0", 10, 20);
		g.drawString("LIFE:3", 10, 35);
		
	}
	
	int Status = 0;//状态值0 ready  1 running 2pause 3game over
	//绘制游戏状态
	void paintState(Graphics g){
		//括号可以放五种类型，byte short char int 枚举 1.7的jdk后可以放String
		switch(Status){
			case 0:
				BufferedImage start =
				ImageUtil.load("start.png");
				g.drawImage(start, 0, 0, null)				
				;break;
			case 2:
				BufferedImage pause =
				ImageUtil.load("pause.png");
				g.drawImage(pause, 0, 0, null)
				;break;
			case 3:
				BufferedImage gamevoer =
				ImageUtil.load("gameover.png");
				g.drawImage(gamevoer, 0, 0, null)
				;break;
		}
		
	}
	


	public void paint(Graphics g) {
				super.paint(g);
				paintBackGround(g);
				paintScoreAndLife(g);
				//g.drawImage(Hero.image, hero.x, hero.y, null);
				paintState(g);
	}

}
