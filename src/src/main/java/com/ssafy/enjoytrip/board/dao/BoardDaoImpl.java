//package com.ssafy.enjoytrip.board.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.stereotype.Repository;
//
//import com.ssafy.enjoytrip.board.dto.BoardDto;
//
//@Repository
//public class BoardDaoImpl implements BoardDao {
//
//	DataSource dataSource;
//
//	public BoardDaoImpl(DataSource datSource) {
//		super();
//		this.dataSource = datSource;
//	}
//
//	@Override
//	public int registerArticle(BoardDto boardDto) {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		int re = -1;
//
////		TODO : boardDto의 내용을 board table에 insert 하세요!!!
//		// try() 안에 넣을 수도 있지만 finally로 자원을 닫아주는게 더 편함
//		try {
//			conn = dataSource.getConnection();
//			StringBuilder sb = new StringBuilder("insert into board (loc_no, user_id, content, visit_time, title) \n");
//			sb.append("values (?,?,?,?,?)");
//			pstmt = conn.prepareStatement(sb.toString());
//			pstmt.setInt(1, boardDto.getLocNo());
//			pstmt.setString(2, boardDto.getUserId());
//			pstmt.setString(3, boardDto.getContent());
//			pstmt.setString(4, boardDto.getVisitTime());
//			pstmt.setString(5, boardDto.getTitle());
//
//			re = pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.releaseConnection(rs, pstmt, conn);
//		}
//
//		return re;
//	}
//
//	@Override
//	public List<BoardDto> searchListAll(int limit, int offset) {
//		List<BoardDto> list = new ArrayList();
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//			conn = dataSource.getConnection();
//			StringBuilder sb = new StringBuilder("select * from board LIMIT ? OFFSET ?");
//			pstmt = conn.prepareStatement(sb.toString());
//			pstmt.setInt(1, limit);
//			pstmt.setInt(2, offset);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				list.add(new BoardDto(rs.getInt("article_no"), rs.getInt("loc_no"), rs.getString("title"),
//						rs.getString("user_id"), rs.getString("content"), rs.getString("visit_time"),
//						rs.getString("register_time")));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.releaseConnection(rs, pstmt, conn);
//		}
//		return list;
//	}
//
//	@Override
//	public List<BoardDto> searchByLocId(int loc_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<BoardDto> searchMyBoard(String id, int limit, int offset) {
//		List<BoardDto> list = new ArrayList<BoardDto>();
////		TODO : board table의 모든 글정보를 글번호순으로 정렬하여 list에 담고 return 하세요!!!
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet res = null;
////		TODO : boardDto의 내용을 board table에 insert 하세요!!!
//		// try() 안에 넣을 수도 있지만 finally로 자원을 닫아주는게 더 편함
//		try {
//			conn = dataSource.getConnection();
//			pstmt = conn.prepareStatement("select * from board where user_id = ? LIMIT ? OFFSET ?");
//			pstmt.setString(1, id);
//			pstmt.setInt(2, limit);
//			pstmt.setInt(3, offset);
//			res = pstmt.executeQuery();
//			while (res.next()) {
//				list.add(new BoardDto(res.getInt("article_no"), res.getInt("loc_no"), res.getString("title"),
//						res.getString("user_id"), res.getString("content"), res.getString("visit_time"),
//						res.getString("register_time")));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.releaseConnection(res, pstmt, conn);
//		}
//
////		END
//		return list;
//	}
//
//	@Override
//	public void modifyArticle(BoardDto boardDto) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteArticle(int no) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public BoardDto getArticle(int articleNo) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int articleListTotalCnt() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int articleListUserIdTotalCnt(String userId) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public List<BoardDto> articleListSearchWord(int limit, int offset, String searchWord) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
