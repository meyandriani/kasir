-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2017 at 05:22 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ayemtentrem`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_beli`
--

CREATE TABLE `detail_beli` (
  `Id_detailBeli` int(5) NOT NULL,
  `Barang` varchar(30) NOT NULL,
  `Jumlah` int(5) NOT NULL,
  `Harga` int(6) NOT NULL,
  `Sub_Total` int(8) NOT NULL,
  `Nota_Beli` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_beli`
--

INSERT INTO `detail_beli` (`Id_detailBeli`, `Barang`, `Jumlah`, `Harga`, `Sub_Total`, `Nota_Beli`) VALUES
(1, 'Gula', 10000, 4, 40000, 1),
(2, 'Garam', 2000, 1, 2000, 2),
(3, 'Aqua 1L', 4000, 2, 8000, 3),
(4, 'Bawang Putih', 20000, 5, 100000, 4),
(5, 'TTTanggung', 4000, 12, 48000, 5),
(6, 'TTKecil', 2000, 12, 24000, 5),
(7, 'ayam', 12000, 5, 60000, 6),
(8, 'beras', 100000, 1, 100000, 7),
(9, 'gula', 8000, 2, 16000, 7),
(10, 'Timun', 5000, 2, 10000, 8),
(11, 'Kobis', 6000, 3, 18000, 8),
(12, 'Sunlight', 12000, 2, 24000, 9),
(13, 'Garam', 5000, 1, 5000, 9),
(14, 'Gula', 8000, 5, 40000, 10),
(15, 'Gula', 8000, 2, 16000, 11),
(16, 'Beras', 150000, 1, 150000, 12),
(17, 'Beraas', 115000, 1, 115000, 13);

-- --------------------------------------------------------

--
-- Table structure for table `detail_jual`
--

CREATE TABLE `detail_jual` (
  `Id_detailJual` int(5) NOT NULL,
  `Id_Menu` int(5) NOT NULL,
  `Jumlah` int(5) NOT NULL,
  `Harga` int(6) NOT NULL,
  `Sub_Total` int(8) NOT NULL,
  `Nota_Jual` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_jual`
--

INSERT INTO `detail_jual` (`Id_detailJual`, `Id_Menu`, `Jumlah`, `Harga`, `Sub_Total`, `Nota_Jual`) VALUES
(1, 2, 4, 60000, 240000, 1),
(3, 2, 3, 60000, 180000, 2),
(4, 3, 4, 14500, 58000, 2),
(5, 2, 2, 60000, 120000, 3),
(6, 1, 4, 3000, 12000, 4),
(7, 2, 1, 60000, 60000, 4),
(8, 3, 2, 14500, 29000, 4),
(9, 3, 20, 14500, 290000, 5),
(10, 1, 15, 3000, 45000, 5),
(11, 2, 1, 60000, 60000, 5),
(12, 5, 12, 8000, 96000, 6),
(13, 4, 4, 14000, 56000, 6),
(14, 1, 6, 3000, 18000, 7),
(15, 5, 9, 8000, 72000, 7),
(16, 5, 5, 8000, 40000, 8),
(17, 4, 2, 14000, 28000, 8),
(18, 2, 3, 60000, 180000, 9),
(19, 3, 6, 14500, 87000, 9),
(20, 2, 4, 60000, 240000, 10),
(21, 4, 5, 14000, 70000, 11),
(22, 3, 2, 14500, 29000, 11),
(23, 1, 6, 3000, 18000, 11),
(24, 7, 4, 3000, 12000, 11),
(25, 4, 2, 14000, 28000, 12),
(26, 5, 3, 8000, 24000, 12),
(27, 5, 4, 8000, 32000, 13),
(28, 4, 4, 14000, 56000, 14),
(29, 2, 4, 60000, 240000, 14),
(30, 4, 4, 14000, 56000, 15),
(31, 1, 4, 3000, 12000, 15),
(32, 3, 4, 14500, 58000, 16),
(33, 6, 3, 8000, 24000, 16),
(34, 1, 4, 3000, 12000, 17),
(35, 5, 4, 8000, 32000, 17),
(36, 7, 5, 3000, 15000, 17),
(37, 5, 5, 8000, 40000, 18),
(38, 3, 6, 14500, 87000, 18),
(39, 3, 4, 14500, 58000, 19),
(40, 1, 5, 3000, 15000, 19);

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `Id_Menu` int(5) NOT NULL,
  `Nama_Menu` varchar(30) NOT NULL,
  `Harga` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`Id_Menu`, `Nama_Menu`, `Harga`) VALUES
(1, 'Nasi', 3000),
(2, 'Ingkung', 60000),
(3, 'Dada', 14500),
(4, 'Paha', 14000),
(5, 'Sop Matahari', 8000),
(6, 'Sop Galantin', 8000),
(7, 'Es Jeruk', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `Id_Pegawai` int(3) NOT NULL,
  `User` varchar(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Hak_Akses` varchar(50) NOT NULL,
  `No_HP` varchar(13) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`Id_Pegawai`, `User`, `Nama`, `Hak_Akses`, `No_HP`, `Password`, `Alamat`) VALUES
(4, 'atut456og', 'Luthfi Andriani', 'Admin', '087987568456', '1390096043', 'Selogiri, Wonogiri'),
(6, 'atan837ma', 'Dani Ahmad', 'Operator', '082382738837', '-1481940493', 'Sleman, Yogyakarta'),
(8, 'atul393ol', 'Zuli Nur', 'Operator', '089489289393', '-105294772', 'Boyolali, Jawa Tengah'),
(9, 'athi845ma', 'Dhiani', 'Operator', '098768956845', '-1296705879', 'Sleman, Yogyakarta'),
(10, 'atai832ma', 'Zainn Rosyid', 'Admin', '087345784832', '2009215069', 'Selman Yogyakarta');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `notabeli` int(4) NOT NULL,
  `tglbeli` date NOT NULL,
  `waktubeli` time NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `totalbeli` int(8) NOT NULL,
  `bayar` int(8) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `Id_Pegawai` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`notabeli`, `tglbeli`, `waktubeli`, `keterangan`, `totalbeli`, `bayar`, `jenis`, `Id_Pegawai`) VALUES
(1, '2017-05-17', '01:33:18', 'Di Toko ABS', 40000, 35000, 'Tunai', 4),
(2, '2017-05-17', '01:37:36', 'Di Toko ABC Kurang Bayar = 500', 2000, 1500, 'Tunai', 4),
(3, '2017-05-17', '01:45:51', 'Di Toko Indo', 8000, 10000, 'Tunai', 4),
(4, '2017-05-17', '01:53:46', 'Di Toko Bumbu Oke', 100000, 100000, 'Tunai', 4),
(5, '2017-05-17', '01:56:32', 'Di Toko Plastik Enggal', 72000, 100000, 'Tunai', 4),
(6, '2017-05-17', '11:24:36', 'toko abadi', 180000, 4000000, 'Tunai', 4),
(7, '2017-05-19', '19:42:33', 'toko smbako Kurang Bayar = 16000', 116000, 100000, 'Tunai', 8),
(8, '2017-05-20', '10:58:08', 'Di Sayur Sehta Kurang Bayar = 28000', 28000, 0, 'Kredit', 4),
(9, '2017-05-20', '11:15:28', 'Di Toko Indoo', 29000, 29000, 'Tunai', 9),
(10, '2017-05-20', '11:15:28', 'Di Toko ABS Kurang Bayar = 9000', 69000, 60000, 'Tunai', 9),
(11, '2017-05-20', '13:06:26', 'Toko ASDFg', 16000, 16000, 'Tunai', 4),
(12, '2017-05-20', '13:07:22', 'Di Toko ZXCV Kurang Bayar = 50000', 150000, 100000, 'Tunai', 4),
(13, '2017-05-22', '18:41:02', 'Di Tokom ASD Kurang Bayar = 15000', 115000, 100000, 'Tunai', 4);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `notajual` int(4) NOT NULL,
  `tgljual` date NOT NULL,
  `waktujual` time NOT NULL,
  `totaljual` int(8) NOT NULL,
  `bayar` int(8) NOT NULL,
  `kembali` int(8) NOT NULL,
  `Id_Pegawai` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`notajual`, `tgljual`, `waktujual`, `totaljual`, `bayar`, `kembali`, `Id_Pegawai`) VALUES
(1, '2017-05-16', '21:18:26', 240000, 250000, 10000, 4),
(2, '2017-05-16', '21:20:11', 238000, 250000, 12000, 4),
(3, '2017-05-17', '01:13:01', 120000, 150000, 30000, 4),
(4, '2017-05-17', '03:02:46', 101000, 110000, 9000, 4),
(5, '2017-05-17', '04:34:34', 395000, 400000, 5000, 4),
(6, '2017-05-17', '04:37:05', 152000, 155000, 3000, 4),
(7, '2017-05-17', '11:15:15', 90000, 100000, 10000, 4),
(8, '2017-05-17', '11:39:10', 515000, 2000000, 0, 4),
(9, '2017-05-20', '10:49:51', 267000, 300000, 33000, 4),
(10, '2017-05-20', '10:52:49', 240000, 250000, 10000, 4),
(11, '2017-05-20', '10:56:25', 129000, 150000, 21000, 4),
(12, '2017-05-20', '10:57:33', 52000, 55000, 3000, 4),
(13, '2017-05-20', '11:04:25', 0, 35000, 3000, 4),
(14, '2017-05-20', '11:05:56', 240000, 250000, 10000, 4),
(15, '2017-05-20', '11:08:12', 68000, 70000, 2000, 4),
(16, '2017-05-20', '11:14:33', 82000, 100000, 18000, 9),
(17, '2017-05-20', '11:24:03', 59000, 60000, 1000, 8),
(18, '2017-05-20', '11:27:28', 127000, 130000, 3000, 8),
(19, '2017-05-20', '13:00:24', 73000, 75000, 2000, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_beli`
--
ALTER TABLE `detail_beli`
  ADD PRIMARY KEY (`Id_detailBeli`),
  ADD KEY `Nota_Beli` (`Nota_Beli`);

--
-- Indexes for table `detail_jual`
--
ALTER TABLE `detail_jual`
  ADD PRIMARY KEY (`Id_detailJual`),
  ADD KEY `Id_Menu` (`Id_Menu`),
  ADD KEY `Nota_Jual` (`Nota_Jual`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`Id_Menu`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`Id_Pegawai`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`notabeli`),
  ADD KEY `Id_Pegawai` (`Id_Pegawai`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`notajual`),
  ADD KEY `Id_Pegawai` (`Id_Pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detail_beli`
--
ALTER TABLE `detail_beli`
  MODIFY `Id_detailBeli` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `detail_jual`
--
ALTER TABLE `detail_jual`
  MODIFY `Id_detailJual` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `Id_Menu` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `Id_Pegawai` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `notabeli` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `notajual` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_beli`
--
ALTER TABLE `detail_beli`
  ADD CONSTRAINT `detail_beli_ibfk_1` FOREIGN KEY (`Nota_Beli`) REFERENCES `pembelian` (`notabeli`);

--
-- Constraints for table `detail_jual`
--
ALTER TABLE `detail_jual`
  ADD CONSTRAINT `detail_jual_ibfk_1` FOREIGN KEY (`Id_Menu`) REFERENCES `menu` (`Id_Menu`),
  ADD CONSTRAINT `detail_jual_ibfk_2` FOREIGN KEY (`Nota_Jual`) REFERENCES `penjualan` (`notajual`);

--
-- Constraints for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_ibfk_1` FOREIGN KEY (`Id_Pegawai`) REFERENCES `pegawai` (`Id_Pegawai`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`Id_Pegawai`) REFERENCES `pegawai` (`Id_Pegawai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
