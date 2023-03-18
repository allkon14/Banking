package com.example.banking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var transactions : ArrayList<Transaction>
    private lateinit var transactionAdapter: TransactionAdapter
    private lateinit var linearlayoutManager: LinearLayoutManager

    //private lateinit var binding: ResultProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ResultProfileBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
        setContentView(R.layout.activity_main)

        transactions = arrayListOf(
            Transaction("Стипендия", 4891.00),
            Transaction("Подарок", -1500.00),
            Transaction("Чай", -450.00),
            Transaction("Булочка", -100.00)
        )

        transactionAdapter = TransactionAdapter(transactions)
        linearlayoutManager = LinearLayoutManager(this)


        findViewById<RecyclerView>(R.id.recyclerview).apply{
            adapter = transactionAdapter
            layoutManager = linearlayoutManager
        }
        updateDashboard()
    }
    private fun updateDashboard(){
        val totalAmount = transactions.map{ it.amount}.sum()
        val budgetAmount = transactions.filter { it.amount > 0 }.map{it.amount}.sum()
        val expendAmount = totalAmount - budgetAmount

        findViewById<TextView>(R.id.balance).text = "%.2f ₽".format(totalAmount)
        findViewById<TextView>(R.id.income).text = "%.2f ₽".format(budgetAmount)
        findViewById<TextView>(R.id.expenditure).text = "%.2f ₽".format(expendAmount)


    }
}