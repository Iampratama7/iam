-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Agu 2023 pada 13.47
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ipemarohil_jakarta`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_alumni`
--

CREATE TABLE `data_alumni` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `angkatan` varchar(50) NOT NULL,
  `no_telepon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_alumni`
--

INSERT INTO `data_alumni` (`id`, `nama`, `angkatan`, `no_telepon`) VALUES
('A0021', 'Hendra', '', ''),
('A0022', 'Mgd. Alham', '', ''),
('A0023', 'Ramzen Ampera', '', ''),
('A0024', 'Mhd. Husin', '', ''),
('A0025', 'Sofyan', '', ''),
('A0026', 'Zamhur', '', ''),
('A0027', 'Firman', '', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_anggota`
--

CREATE TABLE `data_anggota` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `status` varchar(50) NOT NULL,
  `angkatan` varchar(50) NOT NULL,
  `universitas` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_anggota`
--

INSERT INTO `data_anggota` (`id`, `nama`, `status`, `angkatan`, `universitas`) VALUES
('A0012', 'Yogi Sani', 'Aktif', '', ''),
('A0013', 'Faizal', 'Aktif', '', ''),
('A0014', 'Nasrul', 'Aktif', '', ''),
('A0015', 'Mh. Dhani', 'Tidak Aktif', '', ''),
('A0016', 'Guntur', 'Aktif', '', ''),
('A0017', 'Deny Rinanda', 'Tidak Aktif', '', ''),
('A0018', 'Al-Hatami', 'Aktif', '', ''),
('A0019', 'anjar', 'Aktif', '2019', 'unindra');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pengurus`
--

CREATE TABLE `data_pengurus` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `departemen` varchar(100) NOT NULL,
  `periode` varchar(20) NOT NULL,
  `angkatan` varchar(50) NOT NULL,
  `universitas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_pengurus`
--

INSERT INTO `data_pengurus` (`id`, `nama`, `departemen`, `periode`, `angkatan`, `universitas`) VALUES
('A0001', 'anjar', 'Ketua Umum', '2022-2023', '2019', 'unindra');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_program_kerja`
--

CREATE TABLE `data_program_kerja` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `departemen` varchar(50) NOT NULL,
  `program_kerja` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_program_kerja`
--

INSERT INTO `data_program_kerja` (`id`, `nama`, `departemen`, `program_kerja`) VALUES
('A0001', 'anjar', 'Ketua Umum', 'pendaftaran anggota');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('Admin', 'ipemarohiljakarta2023');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_alumni`
--
ALTER TABLE `data_alumni`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `data_anggota`
--
ALTER TABLE `data_anggota`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `data_pengurus`
--
ALTER TABLE `data_pengurus`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
