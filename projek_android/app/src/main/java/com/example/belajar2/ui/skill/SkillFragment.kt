package com.example.belajar2.ui.skill


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajar2.databinding.FragmentSkillBinding


class SkillFragment : Fragment() {

    private var _binding: FragmentSkillBinding? = null

    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SkillsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSkillBinding.inflate(inflater, container, false)
        val root: View = binding.root

        recyclerView = binding.recyclerViewHobbies


        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val skilll = mutableListOf(
            Skills("HTML", "HTML (HyperText Markup Language) adalah bahasa markup yang digunakan untuk membuat struktur dasar halaman web."),
            Skills("PHP", "PHP adalah bahasa pemrograman server-side yang dirancang khusus untuk pengembangan web."),
            Skills("MYSQL", "MySQL adalah sistem manajemen basis data (DBMS) open-source yang terkenal karena kecepatan, keandalan, dan kinerjanya."),
            Skills("Java", "Java adalah bahasa pemrograman tingkat tinggi yang awalnya dikembangkan oleh Sun Microsystems (sekarang dimiliki oleh Oracle)."),
            Skills("JAVASCRIPT", "JavaScript adalah bahasa pemrograman yang digunakan untuk mengembangkan konten web dinamis dan interaktif di sisi klien (browser)."),
            Skills("CSS", "CSS (Cascading Style Sheets) adalah bahasa yang digunakan untuk mengendalikan tampilan dan tata letak elemen HTML."),
            Skills("KOTLIN", "Kotlin adalah bahasa pemrograman modern yang kompatibel dengan Java."),
            Skills("JSON", "JSON (JavaScript Object Notation) adalah format pertukaran data yang ringan dan mudah dibaca oleh manusia dan mudah dimengerti oleh mesin."),

        )
        adapter = SkillsAdapter(skilll)
        recyclerView.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}