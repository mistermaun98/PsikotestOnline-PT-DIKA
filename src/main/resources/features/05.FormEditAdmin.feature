Feature: Form Edit Admin Test

  #TCC.PO.030
  Scenario: Check edit data admin dengan field Full Name kosong
    When Admin search data admin "uname24" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Full Name dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Data Full Name Tidak Lengkap

  #TCC.PO.031
  Scenario: Check edit data admin dengan field Privileges kosong
    When Admin search data admin "uname25" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Privileges dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Data Privileges Tidak Lengkap

  #TCC.PO.032
  Scenario: Check edit data admin dengan field Suoervisor kosong
    When Admin search data admin "uname26" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Supervisor dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Data Supervisor Tidak Lengkap

  #TCC.PO.033
  Scenario: Check edit data admin dengan field Telephone kosong
    When Admin search data admin "uname27" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Telephone dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Data Telephone Tidak Lengkap

  #TCC.PO.034
  Scenario: Check edit data admin dengan field User Active kosong
    When Admin search data admin "uname27" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field User Active dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Akun "uname27" tidak dapat login kedalam sistem

  #TCC.PO.035
  Scenario: Check edit data admin dengan field Username kosong
    Given Admin sedang di menu Admin
    When Admin search data admin "test28" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Username dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Username direset menjadi "super"

  #TCC.PO.036
  Scenario: Check edit data admin dengan field Full Name valid
    When Admin search data admin "uname25" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Full Name dengan data valid
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Full Name berhasil diedit

  #TCC.PO.037
  Scenario: Check edit data admin dengan field Privilege valid
    When Admin search data admin "uname25" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Privilege dengan data valid
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Privilege berhasil diedit

  #TCC.PO.038
  Scenario: Check edit data admin dengan field Supervisor valid
    When Admin search data admin "uname27" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Supervisor dengan data valid
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Supervisor berhasil diedit