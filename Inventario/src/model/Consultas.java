package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Consultas extends Conexion {
    
    public boolean registrar(Producto pro){
        PreparedStatement ps=null;
        Connection cn=getConexion();
        String sql="INSERT INTO Productos(idProducto,nameProducto,"
                + "categoriaProducto,cantDispoProducto,valorCompraProducto,"
                + "valorVentaProducto) VALUES(?,?,?,?,?,?)";
        try{
            ps=cn.prepareStatement(sql);
            ps.setInt(1,pro.getIdProducto());
            ps.setString(2,pro.getNameProducto());
            ps.setInt(3,pro.getCategoriaProducto());
            ps.setInt(4, pro.getCantDispoProducto());
            ps.setInt(5, pro.getValorCompraProducto());
            ps.setInt(6, pro.getValorVentaProducto());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                cn.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean modificar(Producto pro){
        PreparedStatement ps=null;
        Connection cn=getConexion();
        String sql="UPDATE Producto SET nameProducto=?,"
                + "categoriaProducto=?,cantDispoProducto=?,valorCompraProducto=?,"
                + "valorVentaProducto=? WHERE idProducto=?";
        try{
            ps=cn.prepareStatement(sql);
            ps.setString(1,pro.getNameProducto());
            ps.setInt(2,pro.getCategoriaProducto());
            ps.setInt(3, pro.getCantDispoProducto());
            ps.setInt(4, pro.getValorCompraProducto());
            ps.setInt(5, pro.getValorVentaProducto());
            ps.setInt(6,pro.getIdProducto());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                cn.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(Producto pro){
        PreparedStatement ps=null;
        Connection cn=getConexion();
        String sql="DELETE FROM Productos WHERE idProducto=?";
        try{
            ps=cn.prepareStatement(sql);
            ps.setInt(1,pro.getIdProducto());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                cn.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean buscar(Producto pro){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection cn=getConexion();
        String sql="SELECT * WHERE idProducto=?";
        try{
            ps=cn.prepareStatement(sql);
            ps.setInt(1,pro.getIdProducto());
            rs=ps.executeQuery();
                        
            if(rs.next()){
                pro.setIdProducto(Integer.parseInt(rs.getString("idProducto")));
                pro.setNameProducto(rs.getString("nameProducto"));
                pro.setCategoriaProducto(Integer.parseInt(rs.getString("categoriaProducto")));
                pro.setCantDispoProducto(Integer.parseInt(rs.getString("cantDispoProducto")));
                pro.setValorCompraProducto(Integer.parseInt(rs.getString("valorCompraProducto")));
                pro.setValorVentaProducto(Integer.parseInt(rs.getString("valorVentaProducto")));
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                cn.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
}
