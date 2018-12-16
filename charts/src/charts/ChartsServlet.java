package charts;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.alibaba.fastjson.JSON;

@WebServlet(value="/charts.do")
public class ChartsServlet extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		//设置请求和响应的编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//进行数据库的操作
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from fruit";
		ArrayList<DeptPerson> list = new ArrayList<>();
		try {
			conn = ConnectionUtils.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				DeptPerson d = new DeptPerson();
				d.setName(rs.getString(1));
				ArrayList<Integer> data = new ArrayList<>();
				data.add(rs.getInt(2));
				data.add(rs.getInt(3));
				data.add(rs.getInt(4));
				data.add(rs.getInt(5));
				data.add(rs.getInt(6));
				data.add(rs.getInt(7));
				data.add(rs.getInt(8));
				data.add(rs.getInt(9));
				data.add(rs.getInt(10));
				data.add(rs.getInt(11));
				data.add(rs.getInt(12));
				data.add(rs.getInt(13));
				d.setData(data);
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(JSON.toJSON(list));
		resp.getWriter().write(JSON.toJSON(list).toString());
	}
}
