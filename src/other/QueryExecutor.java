package other;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class QueryExecutor {

	public static int addPlayer(Player player) throws ClassNotFoundException, SQLException{
		int result=0;
		Connection connection=DBConnector.getConnection();
		String query="INSERT INTO players_history(name) VALUES ('"+player.getName()+"')";
		Statement add = connection.createStatement();
		result=add.executeUpdate(query);
		return result;
	}
	
	public static int updatePlayer(Player player) throws ClassNotFoundException, SQLException{
		int result=0;
		Connection connection=DBConnector.getConnection();
		String query="UPDATE players_history SET won='"+player.getWon()+"' ,lost='"+player.getLost()+"' ,draw='"+player.getDraw()+"' WHERE name='"+player.getName()+"'";
		Statement add = connection.createStatement();
		result=add.executeUpdate(query);
		return result;
	}
	
	
	
	public static Player searchPlayer(String name) throws ClassNotFoundException, SQLException{
		Player player=null;
		Connection connection=DBConnector.getConnection();
		String query="SELECT * FROM players_history WHERE name='"+name+"' ";
		Statement add = connection.createStatement();
		ResultSet resultSet=add.executeQuery(query);
		while(resultSet.next()){
			player=new Player(resultSet.getString(1),resultSet.getInt(2),resultSet.getInt(3),resultSet.getInt(4));
		}
		
		return player;
	}
	
	
	public static List<Player> getAllPlayers() throws ClassNotFoundException, SQLException{
		List<Player> players=new ArrayList<Player>();
		Connection connection=DBConnector.getConnection();
		String query="SELECT * FROM players_history order by won DESC";
		Statement add = connection.createStatement();
		ResultSet resultSet=add.executeQuery(query);
		while(resultSet.next()){
			Player player=new Player(resultSet.getString(1),resultSet.getInt(2),resultSet.getInt(3),resultSet.getInt(4));
			players.add(player);
		}
		
		return players;
	}
	
	
}
