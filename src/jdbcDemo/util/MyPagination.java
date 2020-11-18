package jdbcDemo.util;

import java.util.ArrayList;
import java.util.List;

public class MyPagination {
	public List list=null; //
	private int recordCount=0;//总记录数
	private int pageSize=0;//每页显示的记录数
	private int maxPage=0;//最大页数

	//	获得总的记录数
	public int getRecordCount(){
		return recordCount;
	}
	//	获得最大页数
	public int getMaxPage(){
		int maxPage=(recordCount%pageSize==0?
				recordCount/pageSize:(recordCount/pageSize+1));
		return maxPage;
	}
	//	获取当前的页码数
	public int getPage(String str){
		if(str==null){
			str="0";
		}
		int Page=Integer.parseInt(str);
		if(Page<1){
			Page=1;
		}else{
			if((Page-1)*pageSize+1>recordCount){
				Page=maxPage;
			}
		}
		return Page;
	}
	
//	初始化分页信息
	public List getInitPage(List list, int Page, int pageSize){
//		初始化相关信息
		List<Object> newList=new ArrayList<>();
		this.list=list;//list为获取出来的整个数据记录
		this.recordCount=list.size();
		this.pageSize=pageSize;
		this.maxPage=getMaxPage();

		try{
			for(int i=(Page-1)*pageSize;i<=Page*pageSize-1;i++){
				if(i>recordCount){
					break;
				}
				newList.add(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return newList;
	}
//	获取指定页的信息
	public List getAppointPage(int Page){
		List<Object> newList=new ArrayList<>();
		try {
			for(int i=(Page-1)*pageSize;i<=Page*pageSize-1;i++){
				if(i>recordCount){
					break;
				}
				newList.add(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return newList;
	}
//	输出页面的页信息
	public String printCtrl(int Page,String urlString){
		String strHtml="<table width=100%><tr><td align='center'>";
		strHtml=strHtml+"当前页数：[ "+Page+"/"+maxPage+" ]&nbsp;&nbsp;";
		try {
			if (Page > 1) {
				strHtml = strHtml + "<a href='" + urlString + "?Page=1'>第一页&nbsp;&nbsp;</a>";
				strHtml = strHtml + "<a href='" + urlString + "?Page=" + (Page - 1) + "'>上一页&nbsp;&nbsp;</a>";
			}
			if (Page < maxPage) {
				strHtml = strHtml + "<a href='" + urlString + "?Page=" + (Page + 1) + "'>下一页&nbsp;&nbsp;</a>";
				strHtml = strHtml + "<a href='" + urlString + "?Page=" + maxPage + "'>最后一页</a>";
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		strHtml=strHtml+"</td></tr></table>";
		return strHtml;
	}
	//	输出页面的页信息
	public String printCtrl(int Page){
		String strHtml="<table width=100%><tr><td align='center'>";
		strHtml=strHtml+"当前页数：[ "+Page+"/"+maxPage+" ]&nbsp;&nbsp;";
		try {
			if (Page > 1) {
				strHtml = strHtml + "<a href='?Page=1'>第一页&nbsp;&nbsp;</a>";
				strHtml = strHtml + "<a href='?Page=" + (Page - 1) + "'>上一页&nbsp;&nbsp;</a>";
			}
			if (Page < maxPage) {
				strHtml = strHtml + "<a href='?Page=" + (Page + 1) + "'>下一页&nbsp;&nbsp;</a>";
				strHtml = strHtml + "<a href='?Page=" + maxPage + "'>最后一页</a>";
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		strHtml=strHtml+"</td></tr></table>";
		return strHtml;
	}
}
