-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2017 at 08:24 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE `tb_admin` (
  `Nama` varchar(200) NOT NULL,
  `TTL` varchar(200) NOT NULL,
  `Jabatan` varchar(200) NOT NULL,
  `Username` varchar(200) NOT NULL,
  `Password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`Nama`, `TTL`, `Jabatan`, `Username`, `Password`) VALUES
('Egi Hermawan', '11/11/11', 'Kepala Perpustakaan', 'Egi', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `tb_buku`
--

CREATE TABLE `tb_buku` (
  `kode_buku` varchar(15) NOT NULL,
  `judul_buku` varchar(40) NOT NULL,
  `tanggal_terbit` date NOT NULL,
  `pengarang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_buku`
--

INSERT INTO `tb_buku` (`kode_buku`, `judul_buku`, `tanggal_terbit`, `pengarang`) VALUES
('001', 'Belajar Membaca', '1981-01-09', 'Prof. Drs. Encep, Ph.D, MA'),
('002', 'Belajar Membuat Layangan', '2012-01-01', 'Otong');

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `ID` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `Tgl_Lahir` date NOT NULL,
  `jabatan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`ID`, `nama`, `Tgl_Lahir`, `jabatan`) VALUES
('Udin_1', 'Udin', '2017-04-02', 'petugas');

-- --------------------------------------------------------

--
-- Table structure for table `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `NPM` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jurusan` varchar(25) NOT NULL,
  `tanggal_masuk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`NPM`, `nama`, `tempat_lahir`, `tanggal_lahir`, `jurusan`, `tanggal_masuk`) VALUES
('1641909', 'Egi Hermawan', 'Bandung', '2000-02-06', 'Sistem Informasi', '2017-01-02'),
('1642912', 'Ricky Iqbal', 'Bandung', '1970-01-05', 'Informatika Teknik', '2016-01-02'),
('1642913', 'Septi Slamet Rianto', 'Bandung', '1965-01-07', 'Informatika Teknik', '2017-01-01');

-- --------------------------------------------------------

--
-- Table structure for table `tb_peminjaman`
--

CREATE TABLE `tb_peminjaman` (
  `NPM` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jurusan` varchar(25) NOT NULL,
  `kode_buku` varchar(15) NOT NULL,
  `judul_buku` varchar(40) NOT NULL,
  `tanggal_terbit` date NOT NULL,
  `tanggal_pinjam` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_peminjaman`
--

INSERT INTO `tb_peminjaman` (`NPM`, `nama`, `jurusan`, `kode_buku`, `judul_buku`, `tanggal_terbit`, `tanggal_pinjam`) VALUES
('1641909', 'Egi Hermawan', 'Sistem Informasi', '002', 'Belajar Membuat Layangan', '2012-01-01', '2016-01-24'),
('1642912', 'Ricky Iqbal', 'Informatika Teknik', '002', 'Belajar Membuat Layangan', '2012-01-01', '2016-01-22'),
('1642913', 'Septi Slamet Rianto', 'Informatika Teknik', '001', 'Belajar Membuat Layangan', '1981-01-09', '2016-01-22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `tb_peminjaman`
--
ALTER TABLE `tb_peminjaman`
  ADD PRIMARY KEY (`NPM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
