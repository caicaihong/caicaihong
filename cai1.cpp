#include<GL/glut.h>
void RenderScene(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0f,0.0f,0.0f);
	glRectf(100.0f,150.0f,150.0f,100.0f);
	glFlush();
}
void ChangeSize(GLsizei w,GLsizei h)
{
	if(h==0)
		h=1;
	glViewport(0,0,w,h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	if(w<=h)
		glOrtho(0.0f,250.0f,0.0f,250.0f*h/w,1.0f,-1.0f);
	else
		glOrtho(0.0f,250.0f*w/h,0.0f,250.0f,1.0f,-1.0f);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
}
void SetupRC(void)
{
	glClearColor(1.0f,1.0f,1.0f,1.0f);
}
void main(void)
{

//	glutMainLoop();
//	return 0;
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutCreateWindow("GLRect");
	glutDisplayFunc(&RenderScene);
	glutReshapeFunc(ChangeSize);
	SetupRC();
	glutMainLoop();
}

