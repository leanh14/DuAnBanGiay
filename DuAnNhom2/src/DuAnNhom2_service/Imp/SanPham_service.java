/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom2_service.Imp;

import DuAnNhom2_model.SanPham;
import DuAnNhom2_repository.SanPham_repository;
import java.util.List;

/**
 *
 * @author Dell
 */
public class SanPham_service {
      public static List<SanPham> getAllSP() {
        return SanPham_repository.getAllSP();
    }

//    public static SanPham getLoaiSPbyMa(String ma) {
//        return SanPham_repository.getSPbymaSP(ma);
//    }
}
