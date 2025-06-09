/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugbes_pbo;

/**
 *
 * @author nasyihulwan
 */
public class UserSession {
    private static UserSession instance;

    // Common attributes for both user types
    private String username;
    private String nama; // For both Petugas and Mahasiswa

    // Specific attributes for Mahasiswa
    private String nim;

    // Specific attributes for Petugas
    private String idPetugas;
    private String level;

    private UserSession() {
        // Private constructor to prevent direct instantiation
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // --- Getters and Setters ---

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // For Mahasiswa
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // For Petugas
    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // Method to clear the session (e.g., on logout)
    public void clearSession() {
        this.username = null;
        this.nama = null;
        this.nim = null;
        this.idPetugas = null;
        this.level = null;
    }

    // Helper method to check if a user is logged in
    public boolean isLoggedIn() {
        return this.username != null;
    }
}
