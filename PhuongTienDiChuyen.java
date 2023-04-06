package lab7;

public abstract class PhuongTienDiChuyen {
	    private String loaiPhuongTien;
	    private HangSanXuat hangSanXuat;

	    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
	        this.loaiPhuongTien = loaiPhuongTien;
	        this.hangSanXuat = hangSanXuat;
	    }

	    public String getLoaiPhuongTien() {
			return loaiPhuongTien;
		}

		public void setLoaiPhuongTien(String loaiPhuongTien) {
			this.loaiPhuongTien = loaiPhuongTien;
		}

		public HangSanXuat getHangSanXuat() {
			return hangSanXuat;
		}

		public void setHangSanXuat(HangSanXuat hangSanXuat) {
			this.hangSanXuat = hangSanXuat;
		}

	    public abstract double layVanToc();

	    public abstract void batDau();

	    public abstract void tangToc();

	    public abstract void dungLa();
	
class HangSanXuat {
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }
}
	class MayBay extends PhuongTienDiChuyen {
	    private String loaiNhienLieu;

	    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
	        super(loaiPhuongTien, hangSanXuat);
	        this.loaiNhienLieu = loaiNhienLieu;
	    }

	    public void catCanh() {
	       System.out.println("Chuẩn bị cấp cánh ");
	    }

	    public void haCanh() {
	        
	    }

	    public double layVanToc() {
	        
	        return 0.0;
	    }
	}

	class XeOto extends PhuongTienDiChuyen {
	    private String loainhienlieu;

	    public XeOto(String loaiDongCo, String loaPhuongTien, HangSanXuat hangSanXuat) {
	        super(loaPhuongTien, hangSanXuat);
	        this.loainhienlieu = loaiDongCo;
	    }

	    public double layVanToc() {
	      
	        return 0;
	    }

	}

	
	class XeDap extends PhuongTienDiChuyen {
	    public XeDap(String loaPhuongTien, HangSanXuat hangSanXuat) {
	        super(loaPhuongTien, hangSanXuat);
	    }

	    public double layVanToc() {
	        
	        return 0.0;
	    }

	
		}
	}


