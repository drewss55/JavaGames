package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import com.tutorial.main.Main.STATE;

public class mRender2 {
	
	Main main;
	
	public void render(Graphics g) {
		if(Main.gameState == STATE.Born) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1500, 1000);
		
		Font fnt3 = new Font("arial", 10, 40);
		g.setFont(fnt3);
		
		g.setColor(Color.WHITE);
		g.drawString("Napoleon's Early Years", 10, 40);
		g.drawString("Answer the question to continue!", 10, 680);
		g.fillRect(-10, 50, 475, 2);
		g.fillRect(-10, 640, 610, 2);
		
		Font fnt2 = new Font("arial", 10, 20);
		g.setFont(fnt2);
		
		g.drawString("Napoleon was born on the island of Corsica on August 15,", 30, 100);
		g.drawString("1769. His father fought alongside Pasquale Paoli and the", 30, 150);
		g.drawString("Corsican resistance. Eventually, Napoleon graduated from", 30, 200);
		g.drawString("French military college in 1785. He found out that his father", 30, 250);
		g.drawString("had died from cancer. As Napoleon, would you go back to Corsica", 30, 300);
		g.drawString("to be with your family? Or would you remain in France?", 30, 350);
		}
		if(Main.gameState == STATE.BornY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Congratulations!", 350, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("Your family is happy with your decision!", 300, 170);
			g.drawString("You have gained 10 fame points!", 360, 220);
		}
		if(Main.gameState == STATE.BornN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Oh No!", 500, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("Your family is very disappointed with your decision!", 200, 170);
			g.drawString("You have lost 10 fame points!", 370, 220);
		}
		if(Main.gameState == STATE.Rev) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("Napoleon during the Revolution", 10, 40);
			g.drawString("Answer the question to continue!", 10, 680);
			g.fillRect(-10, 50, 610, 2);
			g.fillRect(-10, 640, 610, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("France became a republic in 1792, 3 years after the revolution", 30, 100);
			g.drawString("began. Napoleon, however, was not in power until 1799. Although", 30, 150);
			g.drawString("he commanded the French at the Battle of Dego against Austria in", 30, 200);
			g.drawString("1796. He won. After this, the Italian campain was put to a halt", 30, 250);
			g.drawString("because the French leaders did not want the fighting to continue.", 30, 300);
			g.drawString("As Napoleon, would you accept this? Or would you go to Paris to", 30, 350);
			g.drawString("try and persuade the leaders to continue the war?", 30, 400);
		}if(Main.gameState == STATE.RevY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Congratulations!", 350, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("Napoleon would've been proud of your decision!", 210, 170);
			g.drawString("You have gained 5 fame points and 10 power points!", 185, 220);
		}
		if(Main.gameState == STATE.RevN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Oh No!", 550, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("Napoleon would've been very disappointed with your decision!", 130, 170);
			g.drawString("Napoleon did almost everything he could to get more power!", 140, 220);
			g.drawString("You lose 5 power points and 5 fame points.", 320, 270);
		}
		if(Main.gameState == STATE.It) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("Napoleon's Italian Campaign", 10, 40);
			g.drawString("Answer the question to continue!", 10, 680);
			g.fillRect(-10, 50, 610, 2);
			g.fillRect(-10, 640, 610, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("Napoleon went to Paris and was able to persuede French leaders", 30, 100);
			g.drawString("to allow him to continue the war. Conditions were poor for the", 30, 150);
			g.drawString("French, including being outnumbered badly. Napoleon was able to", 30, 200);
			g.drawString("show his genious, implementing many of his famous strategies. Then,", 30, 250);
			g.drawString("on May 15, 1796, Napoleon captured the Austrian capital of Milan.", 30, 300);
			g.drawString("After this victory, Napoleon's popularity went up. The French leaders", 30, 350);
			g.drawString("asked him to lead an attack on England, who had one of the best", 30, 400);
			g.drawString("navies. As, Napoleon would you attack England? Or would you cut", 30, 450);
			g.drawString("British trade routes by attacking Egypt?", 30, 500);
		}
		if(Main.gameState == STATE.ItN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Oh No!", 550, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("Your attack is crushed by Britain!", 400, 170);
			g.drawString("You lost out on finding the Rosetta Stone.", 320, 220);
			g.drawString("You lose 5 fame points.", 460, 270);
		}
		if(Main.gameState == STATE.ItY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Good Choice!", 450, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("You beat the Egyptians and cut off Britain!", 300, 170);
			g.drawString("You have also found the Rosetta Stone!", 320, 220);
			g.drawString("You have gained 5 fame points and 5 power points!", 230, 270);
		}
		if(Main.gameState == STATE.eight) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("The Coup of 18 Brumaire", 10, 40);
			g.drawString("Press Space to Continue!", 10, 680);
			g.fillRect(-10, 50, 610, 2);
			g.fillRect(-10, 640, 610, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("In 1799, Napoleon was part of the coup of 18 Brumaire. He", 30, 100);
			g.drawString("overthrew The Directory to become the first consul of France.", 30, 150);
			g.drawString("Napoleon was loved for his military success and his Napoleonic", 30, 200);
			g.drawString("Code. The code was the first set of laws for the Republic. It", 30, 250);
			g.drawString("lowered women's rights and it reintroduced colonial slavery.", 30, 300);
			g.drawString("By 1802, Napoleon was able to establish (short lived) European", 30, 350);
			g.drawString("peace. As a result of everything, Napoleon became consul for life.", 30, 400);
		}
		if(Main.gameState == STATE.eN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Oh No!", 550, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("Due to your unpopularity and lack of success,", 300, 170);
			g.drawString("you do not become consul for life, however, you", 265, 220);
			g.drawString("stay consul. (For Now) Try to make better decisions", 225, 270);
			g.drawString("to avoid a rebellion.", 500, 320);
		}
		if(Main.gameState == STATE.eY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Good Job!", 500, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("Your great decision making has made you consul", 250, 170);
			g.drawString("for life! Keep up the great work!", 400, 220);
		}
		if(Main.gameState == STATE.ba) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("The Battle of Austerlitz and British Sanctions", 10, 40);
			g.drawString("Answer the question to continue!", 10, 680);
			g.fillRect(-10, 50, 850, 2);
			g.fillRect(-10, 640, 850, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("In 1803, Napoleon sold France's Louisiana Territory to the USA", 30, 100);
			g.drawString("for around $15 Million. In late 1805, Napoleon won one of the", 30, 150);
			g.drawString("greatest victories of his life. Napoleon’s great mind came to play", 30, 200);
			g.drawString("at the Battle of Austerlitz. France was greatly outnumbered, but", 30, 250);
			g.drawString("was able to defeat the Russians and the Austrians, two of the great", 30, 300);
			g.drawString("empires of Europe. Then Napoleon suffered a devestating loss at the", 30, 350);
			g.drawString("Battle of Trafalgar to Britian. As Napoleon, would you put restrictions", 30, 400);
			g.drawString("on British trade for the possibility of peace?", 30, 450);
		}
		if(Main.gameState == STATE.baN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Good!", 550, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("Choosing to not sanction Britain could prevent the Peninsular Wars.", 100, 170);
			g.drawString("However, status with Britain does not change.", 290, 220);
			g.drawString("Everything stays the same.", 430, 270);
		}
		if(Main.gameState == STATE.baY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Oh No!", 520, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("Sanctioning Britain creates the opposite of peace.", 250, 170);
			g.drawString("This causes the Peninsular Wars.", 370, 220);
			g.drawString("You lose 5 power and 5 fame points.", 345, 270);
		}
		if(Main.gameState == STATE.ru) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("Napoleon's Russian Invasion", 10, 40);
			g.drawString("Answer the question to continue!", 10, 680);
			g.fillRect(-10, 50, 610, 2);
			g.fillRect(-10, 640, 610, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("In 1812, Napoleon commanded an army of 600,000 into Russia.", 30, 100);
			g.drawString("Whenever Napoleon launched an attack, Russia retreated, forcing", 30, 150);
			g.drawString("Napoleon deeper into the freezing interior. Napoleon got to Moscow,", 30, 200);
			g.drawString("but no one was there. As Napoleon, would you retreat and try to", 30, 250);
			g.drawString("salvage what is left of your freezing, starving, exhausted army?", 30, 300);
			g.drawString("Or would you continue the attack?", 30, 350);
		}
		if(Main.gameState == STATE.ruN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Good!", 550, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("Retreating allows the 100,000 soldiers left to escape.", 100, 170);
			g.drawString("Your power and fame remains the same.", 290, 220);
		}
		if(Main.gameState == STATE.ruY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Oh No!", 520, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("Not retreating allows the Russians to easily beat", 250, 170);
			g.drawString("your cold, tired, and shrinking army.", 370, 220);
			g.drawString("You lose 5 power and 5 fame points.", 345, 270);
		}
		if(Main.gameState == STATE.loss) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("The Peninsular War and The Loss of Paris", 10, 40);
			g.drawString("Answer the question to continue!", 10, 680);
			g.fillRect(-10, 50, 850, 2);
			g.fillRect(-10, 640, 850, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("Napoleon had invaded the Iberian Peninsula earlier trying to", 30, 100);
			g.drawString("force Spain and Portugal into sanctioning Britain. Unfortuneatly,", 30, 150);
			g.drawString("this resulted in France being forced to retreat out. Then, in 1813,", 30, 200);
			g.drawString("Napoleon suffered another major loss at the Battle of Leipzig.", 30, 250);
			g.drawString("France lost to the combined forces of Austria, Russia, Prussia,", 30, 300);
			g.drawString("and Sweden. Later, in 1814, Napoleon suffered his greatest loss,", 30, 350);
			g.drawString("Paris. Napoleon was exiled to the island of Elba. As Napoleon, is", 30, 400);
			g.drawString("it worth the risk to attempt to escape and become leader again?", 30, 450);
		}
		if(Main.gameState == STATE.lossN) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Good!", 550, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("You do not become the leader again.", 300, 170);
			g.drawString("You lose 10 power and 10 fame points.", 290, 220);
		}
		if(Main.gameState == STATE.lossY) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt5 = new Font("arial", 10, 80);
			Font fnt6 = new Font("arial", 10, 40);
			g.setFont(fnt5);
			
			g.setColor(Color.white);
			g.drawString("Good!", 520, 80);
			g.drawString("Press Space to Continue", 200, 680);
			
			g.setFont(fnt6);
			g.drawString("You escape successfully and become consul again!", 250, 170);
			g.drawString("According to BBC.com, “troops sent to arrest him defected and joined him,”", 30, 220);
			g.drawString("You gain 15 power and 10 fame points.", 345, 270);
		}
		if(Main.gameState == STATE.o00) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt9 = new Font("arial", 10, 40);
			g.setFont(fnt9);
			
			g.setColor(Color.WHITE);
			g.drawString("The Hundred Days", 10, 40);
			g.drawString("Press Enter to Finish!", 10, 680);
			g.fillRect(-10, 50, 610, 2);
			g.fillRect(-10, 640, 610, 2);
			
			Font fnt0 = new Font("arial", 10, 20);
			g.setFont(fnt0);
			
			g.drawString("After escaping and becoming consul, Napoleon began the Hundred", 30, 100);
			g.drawString("Days. He knew that most of Europe wanted to take him out of power", 30, 150);
			g.drawString("so he planned to pick them off one by one. He defeated the Prussians", 30, 200);
			g.drawString("at the Battle of Ligny. The Battle of Waterloo did not go the same", 30, 250);
			g.drawString("way. Britain crushed France and Napoleon was again forced to leave", 30, 300);
			g.drawString("the throne. Napoleon died on the island of Saint Helena from most", 30, 350);
			g.drawString("likely stomach cancer.", 30, 400);
		}
		if(Main.gameState == STATE.end) {
			g.setColor(Color.black);
			g.fillRect(0, 0, 1500, 1000);
			
			Font fnt7 = new Font("arial", 10, 80);
			Font fnt8 = new Font("arial", 10, 40);
			g.setFont(fnt7);
			
			g.setColor(Color.white);
			g.drawString("Good!", 550, 80);
			g.drawString("Press Space to Exit", 200, 680);
			
			g.setFont(fnt8);
			g.drawString("You do not become the leader again.", 300, 170);
			g.drawString("You lose 10 power and 10 fame points.", 290, 220);
		}
	
	}

}
