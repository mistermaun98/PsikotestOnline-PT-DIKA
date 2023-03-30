Feature: Form Edit Admin Test

  #TCC.PO.030
  Scenario: Check edit data admin dengan field Full Name kosong
    When Admin search data admin "uname24" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Full Name dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.031
  Scenario: Check edit data admin dengan field Privileges kosong
    When Admin search data admin "uname25" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Privileges dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.032
  Scenario: Check edit data admin dengan field Suoervisor kosong
    When Admin search data admin "uname26" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Privileges dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Mohon Lengkapi Data

  #TCC.PO.033
  Scenario: Check edit data admin dengan field Telephone kosong
    When Admin search data admin "uname27" dengan Search bar
    And Admin klik tombol action edit
    And Admin edit field Telephone dengan data kosong
    And Admin klik tombol Update
    And Admin konfirmasi update data
    Then Muncul tampilan warning Mohon Lengkapi Data