#include <graphics.h>
#include <conio.h>
#define PI 3.14159265

// 主函数
int main()
{   
	
	// 创建大小为 800 * 600 的绘图窗口
	initgraph(800, 600);

	// 设置原点 (0, 0) 为屏幕中央（Y轴默认向下为正）
	setorigin(0,0);

	// 使用白色填充背景
	setbkcolor(WHITE);
	cleardevice();


	//红旗背景
	setfillcolor(RGB(232, 23, 23));						
	setlinecolor(BLACK);
	solidrectangle(100,100,700,500);


	//中字
    setfillcolor(RGB(255, 2557, 0));               //中字框
    setlinecolor(BLACK);
    solidrectangle(150,220,340,300);
    
	setfillcolor(RGB(255, 2557, 0));              //竖
    setlinecolor(BLACK);
    solidrectangle(235,170,260,430);

	setfillcolor(RGB(232, 23, 23));                 //左边
    setlinecolor(BLACK);
    solidrectangle(170,240,235,280);

	setfillcolor(RGB(232, 23, 23));                 //右边
    setlinecolor(BLACK);
    solidrectangle(260,240,320,280);


	//国字
	setfillcolor(RGB(255, 2557, 0));              //方框1
    setlinecolor(BLACK);
    solidrectangle(440,170,640,430);

	setfillcolor(RGB(232, 23, 23));              //方框2
    setlinecolor(BLACK);
    solidrectangle(460,190,620,410);



	//玉字
	setfillcolor(RGB(255, 2557, 0));              //一横
    setlinecolor(BLACK);
    solidrectangle(480,220,600,240);

	setfillcolor(RGB(255, 2557, 0));              //二横
    setlinecolor(BLACK);
    solidrectangle(480,290,600,310);

	setfillcolor(RGB(255, 2557, 0));              //三横
    setlinecolor(BLACK);
    solidrectangle(480,360,600,380);

	setfillcolor(RGB(255, 2557, 0));              //一竖
    setlinecolor(BLACK);
    solidrectangle(530,240,555,360);

	setfillcolor(RGB(255, 2557, 0));              //一点
    setlinecolor(BLACK);
    solidrectangle(575,320,590,355);


	// 按任意键退出
	_getch();
	closegraph();
}